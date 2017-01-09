package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FundPricesModel;

/**
 * Fon Fiyatları API mevcut fon değerleri almak için izin verir.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface IFindPrices {

  /**
   * Mevcut fon değerleri almak için izin verir.
   * <pre>{@code Akbank4J<FundPricesModel> findPrices = akbank.getFindPrices(AkbankParameters.FundPrices.TYPE_A);}</pre>
   * <pre>{@code Akbank4J<FundPricesModel> findPrices = akbank.getFindPrices(AkbankParameters.FundPrices.TYPE_B);}</pre>
   * <pre>{@code Akbank4J<FundPricesModel> findPrices = akbank.getFindPrices(AkbankParameters.FundPrices.ALL);}</pre>
   *
   * @param fundType Fon Türü
   *
   * @return Akbank4J
   */
  public Akbank4J<FundPricesModel> getFindPrices(String fundType);

}
