package org.akbank4j.core;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.akbank4j.core.api.AkbankParameters;
import org.akbank4j.core.api.AkbankUrl;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.authentication.Configuration;
import org.akbank4j.core.conf.Connection;
import org.akbank4j.core.models.CreditApplicationServiceModel;
import org.akbank4j.core.models.CreditInterestRatesModel;
import org.akbank4j.core.models.CreditPaymentPlanModel;
import org.akbank4j.core.models.ExchangeRatesModel;
import org.akbank4j.core.models.FindAtmModel;
import org.akbank4j.core.models.FindBranchModel;
import org.akbank4j.core.models.FundPricesModel;
import org.akbank4j.core.models.StockValuesModel;
import org.akbank4j.core.request.CreditPaymentPlanRequest;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class Akbank
        implements IAkbank {

  private Connection conn;

  public Akbank(Configuration conf) {
    conn = new Connection(conf);
  }

  @Override
  public Akbank4J<CreditInterestRatesModel> getCreditInterestRate(String creditType) {
    try {
      StringBuilder sb = new StringBuilder();
      sb.append("?");
      sb.append(URLEncoder.encode(AkbankParameters.CreditInterestRates.NAME, "UTF-8") + "="
              + URLEncoder.encode(creditType, "UTF-8"));
      conn.openConnection(AkbankUrl.CreditInterestRates, AkbankParameters.HTTP_METHOD.GET, sb.toString());
      return new Gson().fromJson(conn.json,
                                 new TypeToken<Akbank4J<CreditInterestRatesModel>>() {
                         }.getType());
    } catch (UnsupportedEncodingException ex) {
      Logger.getLogger(Akbank.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates() {
    {
      conn.openConnection(AkbankUrl.ExchangeRates, AkbankParameters.HTTP_METHOD.GET);
      return new Gson().fromJson(conn.json,
                                 new TypeToken<Akbank4J<ExchangeRatesModel>>() {
                         }.getType());
    }

  }

  @Override
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String param, String value, boolean isTwoParam) {
    try {
      StringBuilder sb = new StringBuilder();
      if (isTwoParam) {
        sb.append("?");
        sb.append(URLEncoder.encode(AkbankParameters.ExchangeRates.CURRENCY_CODE, "UTF-8") + "="
                + URLEncoder.encode(param, "UTF-8"));
        sb.append("?");
        sb.append(URLEncoder.encode(AkbankParameters.ExchangeRates.DATE, "UTF-8") + "="
                + URLEncoder.encode(value, "UTF-8"));
      } else {
        sb.append("?");
        sb.append(URLEncoder.encode(param, "UTF-8") + "="
                + URLEncoder.encode(value, "UTF-8"));
      }
      conn.openConnection(AkbankUrl.ExchangeRates, AkbankParameters.HTTP_METHOD.GET, sb.toString());
      return new Gson().fromJson(conn.json,
                                 new TypeToken<Akbank4J<ExchangeRatesModel>>() {
                         }.getType());
    } catch (UnsupportedEncodingException ex) {
      Logger.getLogger(Akbank.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public Akbank4J<FundPricesModel> getFindPrices(String fundType) {
    try {
      StringBuilder sb = new StringBuilder();
      sb.append("?");
      sb.append(URLEncoder.encode(AkbankParameters.FundPrices.NAME, "UTF-8") + "="
              + URLEncoder.encode(fundType, "UTF-8"));
      conn.openConnection(AkbankUrl.FindPrices, AkbankParameters.HTTP_METHOD.GET, sb.toString());
      return new Gson().fromJson(conn.json,
                                 new TypeToken<Akbank4J<FundPricesModel>>() {
                         }.getType());
    } catch (UnsupportedEncodingException ex) {
      Logger.getLogger(Akbank.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public Akbank4J<StockValuesModel> getStockValues(String symbol) {
    try {
      StringBuilder sb = new StringBuilder();
      sb.append("?");
      sb.append(URLEncoder.encode(AkbankParameters.StockValues.NAME, "UTF-8") + "="
              + URLEncoder.encode(symbol, "UTF-8"));
      conn.openConnection(AkbankUrl.StockValues, AkbankParameters.HTTP_METHOD.GET, sb.toString());
      return new Gson().fromJson(conn.json,
                                 new TypeToken<Akbank4J<StockValuesModel>>() {
                         }.getType());
    } catch (UnsupportedEncodingException ex) {
      Logger.getLogger(Akbank.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
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

    conn.openConnection(AkbankUrl.CreditPaymentPlan, AkbankParameters.HTTP_METHOD.POST, jdata.toString());
    return new Gson().fromJson(conn.json,
                               new TypeToken<Akbank4J<CreditPaymentPlanModel>>() {
                       }.getType());
  }

  @Override
  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.FindATM.LATITUDE, latitude);
    jdata.addProperty(AkbankParameters.FindATM.LONGITUDE, longitude);
    jdata.addProperty(AkbankParameters.FindATM.RADIUS, radius);
    jdata.addProperty(AkbankParameters.FindATM.CITY, city);
    jdata.addProperty(AkbankParameters.FindATM.DISTRICT, district);
    jdata.addProperty(AkbankParameters.FindATM.SEARCH_TEXT, searchText);
    conn.openConnection(AkbankUrl.FindAtm, AkbankParameters.HTTP_METHOD.POST, jdata.toString());
    return new Gson().fromJson(conn.json,
                               new TypeToken<Akbank4J<List<FindAtmModel>>>() {
                       }.getType());
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

    conn.openConnection(AkbankUrl.FindBranch, AkbankParameters.HTTP_METHOD.POST, jdata.toString());
    return new Gson().fromJson(conn.json,
                               new TypeToken<Akbank4J<FindBranchModel>>() {
                       }.getType());
  }

  @Override
  public Akbank4J<CreditApplicationServiceModel> getCreditApp(String phoneNumber, String identityNumber) {
    JsonObject jdata = new JsonObject();
    jdata.addProperty(AkbankParameters.CreditAppService.PHONE_NUMBER, phoneNumber);
    jdata.addProperty(AkbankParameters.CreditAppService.IDENTITY_NUMBER, identityNumber);

    conn.openConnection(AkbankUrl.CreditAppService, AkbankParameters.HTTP_METHOD.POST, jdata.toString());
    return new Gson().fromJson(conn.json,
                               new TypeToken<Akbank4J<CreditApplicationServiceModel>>() {
                       }.getType());
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

    conn.openConnection(AkbankUrl.CreditCardAppService, AkbankParameters.HTTP_METHOD.POST, jdata.toString());
    return new Gson().fromJson(conn.json,
                               new TypeToken<Akbank4J>() {
                       }.getType());
  }
}
