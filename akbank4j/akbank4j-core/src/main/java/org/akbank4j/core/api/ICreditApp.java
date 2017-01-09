package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditApplicationServiceModel;

/**
 * Bu API, Akbank kredisini kullanmanıza izin verir.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface ICreditApp {

  /** Telefon ve T.C kimlik numarası ile kredi başvurusu yapılır.
   * <pre>{@code Akbank4J<CreditApplicationServiceModel> creditApp = akbank.getCreditApp("05321234567", "12345678901");}</pre>
   *
   * @param phoneNumber    Telefon numarası
   * @param identityNumber T.C Kimlik Numarası
   *
   * @return Akbank4J
   */
  public Akbank4J<CreditApplicationServiceModel> getCreditApp(String phoneNumber, String identityNumber);

}
