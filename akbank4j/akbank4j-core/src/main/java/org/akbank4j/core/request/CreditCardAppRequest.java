package org.akbank4j.core.request;

/**
 * This API allows you to apply for Akbank credit card.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditCardAppRequest {

  /** Credit Card applicant name (Required) */
  private String name;

  /** Credit Card applicant second name (Optional) */
  private String secondName;

  /** Credit Card applicant surname (Required) */
  private String surname;

  /** Credit Card applicant email address. (Required) */
  private String email;

  /** Credit Card applicant phone number. In the format of 5XX1234567. (Required) */
  private String phoneNumber;

  /** Turkish identity number of the credit card applicant. (Required) */
  private String identityNumber;

  /** Application name of the API consumer application (Required) */
  private String application;

  /**
   * Kredi kartı isteği bulunurken parametreyi sınıf olarak göndermek istenildiğinde kullanılır.
   */
  public CreditCardAppRequest() {
  }

  /**
   * Kredi kartı isteği bulunurken parametreyi sınıf olarak göndermek istenildiğinde kullanılır. Bu kullanımda ikinci ad
   * yoktur.
   * <pre>{@code CreditCardAppRequest creditCardReq = new CreditCardAppRequest("Ali", "Doğru", "ali.dogru@akbank.com", "05359112233", "127762123454", "ApplicationX");}</pre>
   *
   * @param name           Ad
   * @param surname        Soyad
   * @param email          E-Posta
   * @param phoneNumber    Telefon
   * @param identityNumber T.C Kimlik No
   * @param application    Uygulama
   */
  public CreditCardAppRequest(String name, String surname, String email,
                              String phoneNumber, String identityNumber, String application) {
    this.name = name;
    this.secondName = null;
    this.surname = surname;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.identityNumber = identityNumber;
    this.application = application;

  }

  /**
   * Kredi kartı isteği bulunurken parametreyi sınıf olarak göndermek istenildiğinde kullanılır. Bu kullanımda ikinci ad
   * vardır.
   * <pre>{@code CreditCardAppRequest creditCardReq = new CreditCardAppRequest("Ali", "Veli", "Doğru", "ali.dogru@akbank.com", "05359112233", "127762123454", "ApplicationX");}</pre>
   *
   * @param name           Ad
   * @param secondName     İkinci Ad
   * @param surname        Soyad
   * @param email          E-Posta
   * @param phoneNumber    Telefon
   * @param identityNumber T.C Kimlik No
   * @param application    Uygulama
   */
  public CreditCardAppRequest(String name, String secondName, String surname, String email,
                              String phoneNumber, String identityNumber, String application) {
    this.name = name;
    this.secondName = secondName;
    this.surname = surname;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.identityNumber = identityNumber;
    this.application = application;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getIdentityNumber() {
    return identityNumber;
  }

  public void setIdentityNumber(String identityNumber) {
    this.identityNumber = identityNumber;
  }

  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

}
