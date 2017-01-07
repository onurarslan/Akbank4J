package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FundPricesModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindPrices {

  public Akbank4J<FundPricesModel> getFindPrices(String fundType);

}
