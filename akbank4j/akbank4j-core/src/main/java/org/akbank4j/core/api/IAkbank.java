package org.akbank4j.core.api;

/**
 * API'nin sağladığı her hizmletle ilgili servis interface sınıfları buraya eklenir.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface IAkbank
        extends ICreditApp,
                ICreditCardApp,
                ICreditInterestRate,
                ICreditPaymentPlan,
                IExchangeRates,
                IFindATM,
                IFindBranch,
                IFundPrices,
                IStockValues {

}
