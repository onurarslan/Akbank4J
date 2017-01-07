package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.ExchangeRatesModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IExchangeRates {

  public Akbank4J<ExchangeRatesModel> getExchangeRates();

  public Akbank4J<ExchangeRatesModel> getExchangeRates(String param, String value, boolean isTwoParam);

}
