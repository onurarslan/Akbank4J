package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditInterestRatesModel;

/**
 * Kredi Faiz Oranları API size güncel faiz oranlarını almanızı sağlar.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface ICreditInterestRate {

  /** Tüketici Kredisi, Mortgage Kredisi, Araç Kredisi başvurusu yapmanızı sağlar.
   * <pre>{@code Akbank4J<CreditInterestRatesModel> creditInterest = getCreditInterestRate(AkbankParameters.CreditInterestRates.CONSUMER_LOAN)}</pre>
   * <pre>{@code Akbank4J<CreditInterestRatesModel> creditInterest = getCreditInterestRate(AkbankParameters.CreditInterestRates.MORTGAGE_LOAN)}</pre>
   * <pre>{@code Akbank4J<CreditInterestRatesModel> creditInterest = getCreditInterestRate(AkbankParameters.CreditInterestRates.CAR_LOAN)}</pre>
   *
   * @param creditType Kredi Türü seçilir
   *
   * @return Akbank4J
   */
  public Akbank4J<CreditInterestRatesModel> getCreditInterestRate(String creditType);

}
