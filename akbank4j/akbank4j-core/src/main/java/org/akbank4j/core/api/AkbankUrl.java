package org.akbank4j.core.api;

/**
 * API'nin sağladığı servislerin linkleri yer almaktadır.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface AkbankUrl {

  public String CreditInterestRates = "/creditInterestRates";

  public String ExchangeRates = "/exchangeRatesApi";

  public String FindPrices = "/fundPrices";

  public String StockValues = "/stockValues";

  public String CreditPaymentPlan = "/creditPaymentPlan";

  public String FindAtm = "/findATM";

  public String FindBranch = "/findBranch";

  public String CreditAppService = "/applyForCredit";

  public String CreditCardAppService = "/applyForCreditCard";

}
