package org.akbank4j.core.api;

/**
 * API'nin sağladığı her hizmletle ilgili servis interface sınıfları buraya eklenir.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IAkbank
        extends ICreditApp,
                ICreditCardApp,
                ICreditInterestRate,
                ICreditPaymentPlan,
                IExchangeRates,
                IFindATM,
                IFindBranch,
                IFindPrices,
                IStockValues {

}
