package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.StockValuesModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IStockValues {

  public Akbank4J<StockValuesModel> getStockValues(String symbol);

}
