package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.request.CreditCardAppRequest;

/**
 * Bu API, Akbank kredi kartı başvurusunda bulunmanıza izin verir.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface ICreditCardApp {

  /** Ad, ikinci ad, soyad, e-posta, telefon, kimlik numarası ve uygulama adı aracılığı ile kredi kartı başvurusu
   * yapılır.
   * <pre>{@code Akbank4J<CreditCardApplicationModel> creditCardApp = akbank.getCreditCardApp("Ali", "Veli", "Doğru", "ali.dogru@akbank.com", "05359112233", "127762123454", "ApplicationX");}</pre>
   *
   * @param name           Ad
   * @param secondName     İkinci Ad
   * @param surname        Soyad
   * @param email          E-Posta
   * @param phoneNumber    Telefon
   * @param identityNumber T.C Kimlik No
   * @param application    Uygulama
   *
   * @return Akbank4J
   */
  public Akbank4J getCreditCardApp(String name, String secondName, String surname, String email,
                                   String phoneNumber, String identityNumber, String application);

  /** Ad, soyad, e-posta, telefon, kimlik numarası ve uygulama adı aracılığı ile kredi kartı başvurusu yapılır.
   * <pre>{@code Akbank4J<CreditCardApplicationModel> creditCardApp = akbank.getCreditCardApp("Ali", "Doğru", "ali.dogru@akbank.com", "05359112233", "127762123454", "ApplicationX");}</pre>
   *
   * @param name           Ad
   * @param surname        Soyad
   * @param email          E-Posta
   * @param phoneNumber    Telefon
   * @param identityNumber T.C Kimlik No
   * @param application    Uygulama
   *
   * @return Akbank4J
   */
  public Akbank4J getCreditCardApp(String name, String surname, String email,
                                   String phoneNumber, String identityNumber, String application);

  /** CreditCardAppRequest sınıfı kullanılarak kredi kartı başvurusu yapılır.
   * <pre>{@code CreditCardAppRequest creditCardReq = new CreditCardAppRequest("Ali", "Veli", "Doğru", "ali.dogru@akbank.com", "05359112233", "127762123454", "ApplicationX");
   * Akbank4J<CreditCardApplicationModel> creditCard = akbank.getCreditCardApp(creditCardReq);}</pre>
   *
   * @param creditCardApp CreditCardAppRequest.class
   *
   * @return Akbank4J
   */
  public Akbank4J getCreditCardApp(CreditCardAppRequest creditCardApp);

}
