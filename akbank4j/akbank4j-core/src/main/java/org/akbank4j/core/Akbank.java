package org.akbank4j.core;

import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import org.akbank4j.core.api.AkbankUrl;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.conf.Connection;
import org.akbank4j.core.models.CreditApplicationServiceModel;
import org.akbank4j.core.models.CreditInterestRatesModel;
import org.akbank4j.core.models.CreditPaymentPlanModel;
import org.akbank4j.core.models.ExchangeRatesModel;
import org.akbank4j.core.models.FindAtmModel;
import org.akbank4j.core.models.FindBranchModel;
import org.akbank4j.core.models.FundPricesModel;
import org.akbank4j.core.models.StockValuesModel;
import org.akbank4j.core.request.AkbankParameters;
import org.akbank4j.core.request.CreditCardAppRequest;
import org.akbank4j.core.request.CreditPaymentPlanRequest;
import org.akbank4j.core.request.FindRequest;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class Akbank
        implements IAkbank {

  private static Connection conn;
  private static IAkbank instance;

  private Akbank() {
  }

  /**
   * API'nin çalıştırılması için konfigurasyon yapılmsaı gerekmektedir.
   * <pre>{@code Configuration conf = new Configuration("your_api_key_name", "your_api_key");
   * Akbank akbank = Akbank.getInstance();}</pre>
   *
   *
   */
  public static IAkbank getInstance() {
    if (instance == null) {
      instance = new Akbank();
    }
    return instance;
  }

  /**
   * API'nin çalıştırılması için konfigurasyon yapılmsaı gerekmektedir.
   * <pre>{@code Configuration conf = new Configuration("your_api_key_name", "your_api_key");
   * Akbank akbank = Akbank.getInstance(conf);}</pre>
   *
   * @param conf Configuration.class
   */
  public static IAkbank getInstance(Configuration conf) {
    if (conn == null) {
      conn = new Connection(conf);
    }
    return getInstance();
  }

  @Override
  public Akbank4J<CreditInterestRatesModel> getCreditInterestRate(String creditType) {
    String url = AkbankUrl.CreditInterestRates + "?" + AkbankParameters.CreditInterestRates.NAME + "=" + creditType;
    return conn.openConnection(url, AkbankParameters.HTTP_METHOD.GET,
                               new TypeToken<Akbank4J<CreditInterestRatesModel>>() {
                       });

  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates() {
    return conn.openConnection(AkbankUrl.ExchangeRates, AkbankParameters.HTTP_METHOD.GET,
                               new TypeToken<Akbank4J<ExchangeRatesModel>>() {
                       });

  }

  /**
   * isTwoParam false ise; parametre tipi ve değeri gönderilir.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates(AkbankParameters.ExchangeRates.DATE, "2016-02-01", false);
   * Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates(AkbankParameters.ExchangeRates.CURRENCY_CODE, "002", false);}</pre>
   * isTwoParam true ise; iki tane parametre aynı anda gönderilecektir. İlk parametreye currencyCode, ikinci parametreye
   * date yazılır.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates("001", "2015-10-08", true);}</pre>
   *
   * @param param      tek parametre/currencyCode
   * @param value      tek parametre değeri/date
   * @param isTwoParam tek parametre ise false çift ise true
   *
   * @return Akbank4J
   */
  private Akbank4J<ExchangeRatesModel> getExchangeRates(String param, String value, boolean isTwoParam) {
    StringBuilder url = new StringBuilder(AkbankUrl.ExchangeRates + "?");
    if (isTwoParam) {
      url.append(AkbankParameters.ExchangeRates.CURRENCY_CODE).append("=").append(param).append("?");
      url.append(AkbankParameters.ExchangeRates.DATE).append("=").append(value);
    } else {
      url.append(param).append("=").append(value);
    }
    return conn.openConnection(url.toString(), AkbankParameters.HTTP_METHOD.GET,
                               new TypeToken<Akbank4J<ExchangeRatesModel>>() {
                       });
  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String currencyCode) {
    return getExchangeRates(AkbankParameters.ExchangeRates.CURRENCY_CODE, currencyCode, false);
  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates(Date date) {
    return getExchangeRates(AkbankParameters.ExchangeRates.DATE, Akbank4jDateUtil.toAkbankFormat(date), false);
  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String currencyCode, Date date) {
    return getExchangeRates(currencyCode, Akbank4jDateUtil.toAkbankFormat(date), true);
  }

  @Override
  public Akbank4J<FundPricesModel> getFundPrices(String fundType) {
    String url = AkbankUrl.ExchangeRates + "?" + AkbankParameters.FundPrices.NAME + "=" + fundType;
    return conn.openConnection(url, AkbankParameters.HTTP_METHOD.GET,
                               new TypeToken<Akbank4J<FundPricesModel>>() {
                       });

  }

  @Override
  public Akbank4J<StockValuesModel> getStockValues(String symbol) {
    String url = AkbankUrl.StockValues + "?" + AkbankParameters.StockValues.NAME + "=" + symbol;
    return conn.openConnection(url, AkbankParameters.HTTP_METHOD.GET,
                               new TypeToken<Akbank4J<StockValuesModel>>() {
                       });
  }

  @Override
  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(CreditPaymentPlanRequest creditPaymentPlan) {
    return getCreditPaymentPlan(creditPaymentPlan.getBsmv(), creditPaymentPlan.getInterest(), creditPaymentPlan.
                                getKkdf(),
                                creditPaymentPlan.getLoanStartDate(), creditPaymentPlan.getLoanUsingDate(),
                                creditPaymentPlan.getLoanAmount(), creditPaymentPlan.getExpenseAmount(),
                                creditPaymentPlan.getTerm());
  }

  @Override
  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(String bsmv, String interest, String kkdf,
                                                               String loanStartDate, String loanUsingDate,
                                                               String loanAmount, String expenseAmount,
                                                               String term) {

    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.BSMV, bsmv);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.INTEREST, interest);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.KKDF, kkdf);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.LOAN_START_DATE, loanStartDate);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.LOAN_USING_DATE, loanUsingDate);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.LOAN_AMOUNT, loanAmount);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.EXPENSE_AMOUNT, expenseAmount);
    jdata.addProperty(AkbankParameters.CreditPaymentPlan.TERM, term);

    return conn.openConnection(AkbankUrl.CreditPaymentPlan, AkbankParameters.HTTP_METHOD.POST, jdata.toString(),
                               new TypeToken<Akbank4J<CreditPaymentPlanModel>>() {
                       });
  }

  @Override
  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(double bsmv, double interest, double kkdf,
                                                               Date loanStartDate, Date loanUsingDate,
                                                               int loanAmount, int expenseAmount, int term) {
    return getCreditPaymentPlan(String.valueOf(bsmv), String.valueOf(interest), String.valueOf(kkdf),
                                Akbank4jDateUtil.toAkbankFormat(loanStartDate),
                                Akbank4jDateUtil.toAkbankFormat(loanUsingDate),
                                String.valueOf(loanAmount), String.valueOf(expenseAmount), String.valueOf(term));
  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius,
                                                 String city, String district, String searchText) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.FindATM.LATITUDE, latitude);
    jdata.addProperty(AkbankParameters.FindATM.LONGITUDE, longitude);
    jdata.addProperty(AkbankParameters.FindATM.RADIUS, radius);
    jdata.addProperty(AkbankParameters.FindATM.CITY, city);
    jdata.addProperty(AkbankParameters.FindATM.DISTRICT, district);
    jdata.addProperty(AkbankParameters.FindATM.SEARCH_TEXT, searchText);

    return conn.openConnection(AkbankUrl.FindAtm, AkbankParameters.HTTP_METHOD.POST, jdata.toString(),
                               new TypeToken<Akbank4J<List<FindAtmModel>>>() {
                       });
  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(double latitude, double longitude, int radius,
                                                 String city, String district, String searchText) {
    return getFindATM(String.valueOf(latitude), String.valueOf(longitude), String.valueOf(radius), city, district,
                      searchText);

  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius) {
    return getFindATM(latitude, longitude, radius, null, null, null);
  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(double latitude, double longitude, int radius) {
    return getFindATM(String.valueOf(latitude), String.valueOf(longitude), String.valueOf(radius), null, null, null);
  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(FindRequest findATM) {
    return getFindATM(findATM.getLatitude(), findATM.getLongitude(), findATM.getRadius(), findATM.getCity(), findATM.
                      getDistrict(), findATM.getSearchText());
  }

  @Override
  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.FindBranch.LATITUDE, latitude);
    jdata.addProperty(AkbankParameters.FindBranch.LONGITUDE, longitude);
    jdata.addProperty(AkbankParameters.FindBranch.RADIUS, radius);
    jdata.addProperty(AkbankParameters.FindBranch.CITY, city);
    jdata.addProperty(AkbankParameters.FindBranch.DISTRICT, district);
    jdata.addProperty(AkbankParameters.FindBranch.SEARCH_TEXT, searchText);

    return conn.openConnection(AkbankUrl.FindBranch, AkbankParameters.HTTP_METHOD.POST, jdata.toString(),
                               new TypeToken<Akbank4J<FindBranchModel>>() {
                       });
  }

  @Override
  public Akbank4J<FindBranchModel> getFindBranch(double latitude, double longitude, int radius, String city,
                                                 String district, String searchText) {
    return getFindBranch(String.valueOf(latitude), String.valueOf(longitude), String.valueOf(radius), null, null, null);
  }

  @Override
  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius) {
    return getFindBranch(latitude, longitude, radius, null, null, null);
  }

  @Override
  public Akbank4J<FindBranchModel> getFindBranch(double latitude, double longitude, int radius) {
    return getFindBranch(String.valueOf(latitude), String.valueOf(longitude), String.valueOf(radius), null, null, null);
  }

  @Override
  public Akbank4J<FindBranchModel> getFindBranch(FindRequest findBranch) {
    return getFindBranch(findBranch.getLatitude(), findBranch.getLongitude(), findBranch.getRadius(), findBranch.
                         getCity(), findBranch.getDistrict(), findBranch.getSearchText());
  }

  @Override
  public Akbank4J<CreditApplicationServiceModel> getCreditApp(String phoneNumber, String identityNumber) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.CreditAppService.PHONE_NUMBER, phoneNumber);
    jdata.addProperty(AkbankParameters.CreditAppService.IDENTITY_NUMBER, identityNumber);

    return conn.openConnection(AkbankUrl.CreditAppService, AkbankParameters.HTTP_METHOD.POST, jdata.toString(),
                               new TypeToken<Akbank4J<CreditApplicationServiceModel>>() {
                       });
  }

  @Override
  public Akbank4J getCreditCardApp(CreditCardAppRequest creditCardApp) {
    return getCreditCardApp(creditCardApp.getName(), creditCardApp.getSecondName(), creditCardApp.getSurname(),
                            creditCardApp.getEmail(), creditCardApp.getPhoneNumber(), creditCardApp.getIdentityNumber(),
                            creditCardApp.getApplication());
  }

  @Override
  public Akbank4J getCreditCardApp(String name, String surname, String email,
                                   String phoneNumber, String identityNumber, String application) {
    return getCreditCardApp(name, null, surname, email, phoneNumber, identityNumber, application);
  }

  @Override
  public Akbank4J getCreditCardApp(String name, String secondName, String surname, String email,
                                   String phoneNumber, String identityNumber, String application) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.CreditCardAppService.NAME, name);
    jdata.addProperty(AkbankParameters.CreditCardAppService.SECOND_NAME, secondName);
    jdata.addProperty(AkbankParameters.CreditCardAppService.SURNAME, surname);
    jdata.addProperty(AkbankParameters.CreditCardAppService.EMAIL, email);
    jdata.addProperty(AkbankParameters.CreditCardAppService.PHONE_NUMBER, phoneNumber);
    jdata.addProperty(AkbankParameters.CreditCardAppService.IDENTITY_NUMBER, identityNumber);
    jdata.addProperty(AkbankParameters.CreditCardAppService.APPLICATION, application);

    return conn.openConnection(AkbankUrl.CreditCardAppService, AkbankParameters.HTTP_METHOD.POST, jdata.toString(),
                               new TypeToken<Akbank4J>() {
                       });
  }
}
