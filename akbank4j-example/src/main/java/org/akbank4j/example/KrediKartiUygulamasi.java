package org.akbank4j.example;

import java.io.IOException;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.request.CreditCardAppRequest;

/**
 * Akbank Kredi kartı talebinde bulunmada kullanılır
 * @author Onur Arslan
 */
public class KrediKartiUygulamasi {

  public static void main(String[] args)
          throws IOException {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = new Akbank(conf);

    //*************parametre nesne kullanmadan*************
    Akbank4J krediKarti = akbank.getCreditCardApp("Ali", "Veli", "Doğru", "ali.dogru@akbank.com", "05359112233",
                                                  "127762123454", "ApplicationX");
    System.out.println(krediKarti.getReturnMessage());

    //*****************parametre nesne kullanarak*********
    CreditCardAppRequest krediKartParam = new CreditCardAppRequest("Ali", "Veli", "Doğru", "ali.dogru@akbank.com",
                                                                   "05359112233", "127762123454", "ApplicationX");
    krediKarti = akbank.getCreditCardApp(krediKartParam);
    System.out.println(krediKarti.getReturnMessage());
  }

}
