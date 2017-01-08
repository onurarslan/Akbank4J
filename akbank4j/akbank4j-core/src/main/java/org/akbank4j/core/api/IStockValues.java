package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.StockValuesModel;

/**
 * StockValues API mevcut hisse senedi değerleri almak için izin verir.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IStockValues {

  /**
   * Mevcut hisse senedi değerleri almak için izin verir.
   * <pre>{@code Akbank4J<StockValuesModel> akbankHisse = akbank.getStockValues("AKBNK");}</pre>
   *
   * @param symbol Hisse Senedi Sembolü
   *
   * @return Akbank4J<StockValuesModel>
   */
  public Akbank4J<StockValuesModel> getStockValues(String symbol);

}
