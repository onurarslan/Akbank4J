package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditInterestRatesModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface ICreditInterestRate {

  public Akbank4J<CreditInterestRatesModel> getCreditInterestRate(String creditType);

}
