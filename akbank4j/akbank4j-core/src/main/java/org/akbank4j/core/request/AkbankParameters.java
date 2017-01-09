package org.akbank4j.core.request;

/**
 * Akbank API'ye gönderilecek parametreler burda yer almaktadır.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface AkbankParameters {

  public interface HTTP_METHOD {

    public String GET = "GET";
    public String POST = "POST";
  }

  public interface CreditInterestRates {

    public String NAME = "creditType";
    public String CONSUMER_LOAN = "I";
    public String MORTGAGE_LOAN = "K";
    public String CAR_LOAN = "T";
  }

  public interface ExchangeRates {

    public String DATE = "date";
    public String CURRENCY_CODE = "currencyCode";
  }

  public interface FundPrices {

    public String NAME = "fundType";
    public String TYPE_A = "A";
    public String TYPE_B = "B";
    public String ALL = "T";
  }

  public interface StockValues {

    public String NAME = "symbol";
  }

  public interface CreditPaymentPlan {

    public String BSMV = "bsmv";
    public String INTEREST = "interest";
    public String KKDF = "kkdf";
    public String LOAN_START_DATE = "loanStartDate";
    public String LOAN_USING_DATE = "loanUsingDate";
    public String LOAN_AMOUNT = "loanAmount";
    public String EXPENSE_AMOUNT = "expenseAmount";
    public String TERM = "term";
  }

  public interface FindATM {

    public String LATITUDE = "latitude";
    public String LONGITUDE = "longitude";
    public String RADIUS = "radius";
    public String CITY = "city";
    public String DISTRICT = "district";
    public String SEARCH_TEXT = "searchText";
  }

  public interface FindBranch {

    public String LATITUDE = "latitude";
    public String LONGITUDE = "longitude";
    public String RADIUS = "radius";
    public String CITY = "city";
    public String DISTRICT = "district";
    public String SEARCH_TEXT = "searchText";
  }

  public interface CreditAppService {

    public String PHONE_NUMBER = "phoneNumber";
    public String IDENTITY_NUMBER = "identityNumber";
  }

  public interface CreditCardAppService {

    public String NAME = "name";
    public String SECOND_NAME = "secondName";
    public String SURNAME = "surname";
    public String EMAIL = "email";
    public String PHONE_NUMBER = "phoneNumber";
    public String IDENTITY_NUMBER = "identityNumber";
    public String APPLICATION = "application";
  }

}
