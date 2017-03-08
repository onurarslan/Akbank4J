package org.akbank4j.core.api;

/**
 * API'nin sağladığı servislerin linkleri yer almaktadır.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface AkbankUrl {

  public static final String CreditInterestRates = "/creditInterestRates";

  public static final String ExchangeRates = "/exchangeRatesApi";

  public static final String FindPrices = "/fundPrices";

  public static final String StockValues = "/stockValues";

  public static final String CreditPaymentPlan = "/creditPaymentPlan";

  public static final String FindAtm = "/findATM";

  public static final String FindBranch = "/findBranch";

  public static final String CreditAppService = "/applyForCredit";

  public static final String CreditCardAppService = "/applyForCreditCard";

}
