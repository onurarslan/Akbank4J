
import java.sql.Date;
import java.util.List;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.CreditApplicationServiceModel;
import org.akbank4j.core.models.CreditCardApplicationModel;
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
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class Akbank4JTest {

  private Configuration conf;
  private IAkbank akbank;

  @Before
  public void setUp() {
    conf = new Configuration("your_api_key_name", "your_api_key");
    akbank = Akbank.getInstance(conf);
  }

  @After
  public void tearDown() {
    conf = null;
    akbank = null;
  }

  @Test
  public void testCreditApp() {
    System.out.println("testCreditApp Start...!");
    Akbank4J<CreditApplicationServiceModel> test = akbank.getCreditApp("05321234567", "12345678901");
    Assert.assertNotNull(test.getData());
    System.out.println("testCreditApp End...!");
  }

  @Test
  public void testCreditCardApp() {
    System.out.println("testCreditCardApp Start...!");
    Akbank4J<CreditCardApplicationModel> test = akbank.getCreditCardApp("Ali", "Veli", "Doğru", "ali.dogru@akbank.com",
                                                                        "05359112233", "127762123454", "ApplicationX");
    Assert.assertEquals("Credit Card Application has been successfully completed.", test.getReturnMessage());
    System.out.println("testCreditCardApp End...!");
  }

  @Test
  public void testCreditCardAppReq() {
    System.out.println("testCreditCardAppReq Start...!");

    CreditCardAppRequest creditCardReq = new CreditCardAppRequest("Ali", "Veli", "Doğru", "ali.dogru@akbank.com",
                                                                  "05359112233", "127762123454", "ApplicationX");
    Akbank4J<CreditCardApplicationModel> test
            = akbank.getCreditCardApp(creditCardReq);
    Assert.assertEquals("Credit Card Application has been successfully completed.", test.getReturnMessage());
    System.out.println("testCreditCardAppReq End...!");
  }

  @Test
  public void testCreditInterestRate() {
    System.out.println("testCreditInterestRate Start...!");
    Akbank4J<CreditInterestRatesModel> test = akbank.getCreditInterestRate(
            AkbankParameters.CreditInterestRates.CONSUMER_LOAN);
    Assert.assertNotNull(test.getData());
    System.out.println("testCreditInterestRate End...!");
  }

  @Test
  public void testCreditPaymentPlan() {
    System.out.println("testCreditPaymentPlan Start...!");
    Akbank4J<CreditPaymentPlanModel> test = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10",
                                                                        "2015-11-10", "5000", "10", "36");
    Assert.assertNotNull(test.getData());

    Date startDate = Date.valueOf("2015-11-10");
    Date usingDate = Date.valueOf("2015-11-10");
    test = akbank.getCreditPaymentPlan(0.1234, 1.25, 0.1034, startDate, usingDate, 5000, 10, 36);
    Assert.assertNotNull(test.getData());

    System.out.println("testCreditPaymentPlan End...!");
  }

  @Test
  public void testCreditPaymentPlanReq() {
    System.out.println("testCreditPaymentPlanReq Start...!");
    CreditPaymentPlanRequest creditPaymentReq = new CreditPaymentPlanRequest("0.1234", "1.25", "0.1034", "2015-11-10",
                                                                             "2015-11-10", "5000", "10", "36");
    Akbank4J<CreditPaymentPlanModel> test = akbank.getCreditPaymentPlan(creditPaymentReq);
    Assert.assertNotNull(test.getData());
    System.out.println("testCreditPaymentPlanReq End...!");
  }

  @Test
  public void testExchangeRate() {
    System.out.println("testExchangeRate Start...!");
    Akbank4J<ExchangeRatesModel> test = akbank.getExchangeRates();
    Assert.assertNotNull(test.getData());
    System.out.println(test.getData().getBanknoteBuying());

    Date date = Date.valueOf("2015-10-08");
    test = akbank.getExchangeRates(date);
    Assert.assertNotNull(test.getData());

    //test = akbank.getExchangeRates("002");
    //Assert.assertNotNull(test.getData());
    test = akbank.getExchangeRates("001", date);
    Assert.assertNotNull(test.getData());

    System.out.println("testExchangeRate End...!");
  }

  @Test
  public void testFindAtm() {
    System.out.println("testFindAtm Start...!");
    Akbank4J<List<FindAtmModel>> test
            = akbank.getFindATM("41.008238", "28.978359", "1000", null, null, null);
    Assert.assertNotNull(test.getData());

    test = akbank.getFindATM(41.008238, 28.978359, 1000, null, null, null);
    Assert.assertNotNull(test.getData());

    test = akbank.getFindATM("41.008238", "28.978359", "1000");
    Assert.assertNotNull(test.getData());

    test = akbank.getFindATM(41.008238, 28.978359, 1000);
    Assert.assertNotNull(test.getData());

    FindRequest atmReq = new FindRequest("41.008238", "28.978359", "1000", null, null, null);
    test = akbank.getFindATM(atmReq);

    atmReq = new FindRequest(41.008238, 28.978359, 1000, null, null, null);
    test = akbank.getFindATM(atmReq);
    atmReq = new FindRequest("41.008238", "28.978359", "1000");
    test = akbank.getFindATM(atmReq);

    atmReq = new FindRequest(41.008238, 28.978359, 1000);
    test = akbank.getFindATM(atmReq);

    Assert.assertNotNull(test.getData());
    System.out.println("testFindAtm End...!");
  }

  @Test
  public void testFindBranch() {
    System.out.println("testFindBranch Start...!");
    Akbank4J<FindBranchModel> test
            = akbank.getFindBranch("41.008238", "28.978359", "1000", null, null, null);
    Assert.assertNotNull(test.getData());

    test = akbank.getFindBranch(41.008238, 28.978359, 1000, null, null, null);
    Assert.assertNotNull(test.getData());

    test = akbank.getFindBranch("41.008238", "28.978359", "1000");
    Assert.assertNotNull(test.getData());

    test = akbank.getFindBranch(41.008238, 28.978359, 1000);
    Assert.assertNotNull(test.getData());

    System.out.println("testFindBranch End...!");
  }

  @Test
  public void testFindPrices() {
    System.out.println("testFindPrices Start...!");
    Akbank4J<FundPricesModel> test
            = akbank.getFundPrices(AkbankParameters.FundPrices.TYPE_A);
    Assert.assertNotNull(test.getData());

    test = akbank.getFundPrices(AkbankParameters.FundPrices.TYPE_B);
    Assert.assertNotNull(test.getData());

    test = akbank.getFundPrices(AkbankParameters.FundPrices.ALL);
    Assert.assertNotNull(test.getData());

    System.out.println("testFindPrices End...!");
  }

  @Test
  public void testStockValues() {
    System.out.println("testStockValues Start...!");
    Akbank4J<StockValuesModel> test = akbank.getStockValues("AKBNK");
    Assert.assertNotNull(test.getData());
    System.out.println("testStockValuesEnd...!");
  }
}
