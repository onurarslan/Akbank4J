package org.akbank4j.core.conf;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.request.AkbankParameters;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class Connection {

  public String json;
  static Configuration api;

  public Connection(Configuration api) {
    this.api = api;
  }

  public Akbank4J openConnection(String url, String httpMethod, TypeToken akbankClassType) {
    return openConnection(url, httpMethod, null, akbankClassType);

  }

  public Akbank4J openConnection(String url, String httpMethod, String postData, TypeToken akbankClassType) {
    init();
    Client client = Client.create();
    WebResource webResource = client.resource("https://apigate.akbank.com/api/mock" + url);
    ClientResponse response = null;
    if (httpMethod.equals(AkbankParameters.HTTP_METHOD.GET)) {
      response = webResource.header(api.getName(), api.getValue()).accept("application/json").get(
              ClientResponse.class);
    } else {
      response = webResource.header(api.getName(), api.getValue()).accept("application/json").post(
              ClientResponse.class, postData);
    }

    return new Gson().fromJson(response.getEntity(String.class), akbankClassType.getType());

  }

  @Deprecated
  public void openConnection(String address, String httpMethod) {
    openConnection(address, httpMethod, "");
  }

  @Deprecated
  public void openConnection(String address, String httpMethod, String params) {
    HttpsURLConnection conn = null;

    init();
    try {
      StringBuilder urlBuilder = new StringBuilder("https://apigate.akbank.com/api/mock" + address);
      if (httpMethod.equals(AkbankParameters.HTTP_METHOD.GET)) {
        urlBuilder.append(params);
      }
      URL url = new URL(urlBuilder.toString());
      conn = (HttpsURLConnection) url.openConnection();
      conn.setRequestMethod(httpMethod);
      conn.setRequestProperty(api.getName(), api.getValue());
      if (httpMethod.equals(AkbankParameters.HTTP_METHOD.POST)) {
        byte[] body = params.getBytes();
        conn.setFixedLengthStreamingMode(body.length);
        conn.setDoOutput(true);
        OutputStream out = conn.getOutputStream();
        out.write(body);
      }
      //System.out.println("Response code: " + conn.getResponseCode());
      BufferedReader rd;
      if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else {
        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }
      StringBuilder sb = new StringBuilder();
      String line;
      while ((line = rd.readLine()) != null) {
        sb.append(line);
      }
      rd.close();
      conn.disconnect();
      json = sb.toString();
    } catch (UnsupportedEncodingException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    } catch (MalformedURLException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ProtocolException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

  public static void init() {
    try {
      SSLContext sc = SSLUtil.getInsecureSSLContext();
      HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
      HostnameVerifier allHostsValid = new HostnameVerifier() {
        public boolean verify(String hostname, SSLSession session) {
          return true;
        }
      };
      HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
    } catch (KeyManagementException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    } catch (NoSuchAlgorithmException ex) {
      Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  private static class SSLUtil {

    protected static SSLContext getInsecureSSLContext()
            throws KeyManagementException,
                   NoSuchAlgorithmException {
      final TrustManager[] trustAllCerts = new TrustManager[]{
        new X509TrustManager() {
          public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return null;
          }

          public void checkClientTrusted(
                  final java.security.cert.X509Certificate[] arg0, final String arg1)
                  throws CertificateException {
            // do nothing and blindly accept the certificate
          }

          public void checkServerTrusted(
                  final java.security.cert.X509Certificate[] arg0, final String arg1)
                  throws CertificateException {
            // do nothing and blindly accept the server
          }

        }
      };

      final SSLContext sslcontext = SSLContext.getInstance("SSL");
      sslcontext.init(null, trustAllCerts,
                      new java.security.SecureRandom());
      return sslcontext;
    }
  }

}
