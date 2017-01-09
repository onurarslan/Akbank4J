package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditPaymentPlanModel;
import org.akbank4j.core.request.CreditPaymentPlanRequest;

/**
 * Bu API, kredi ödeme planını almanızı sağlar.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface ICreditPaymentPlan {

  /**
   * Kredi ödeme planı almanızı sağlar.
   * <pre>{@code Akbank4J<CreditPaymentPlanModel> creditPaymentPlan = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");}</pre>
   *
   * @param bsmv          Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı. (Gereklidir)
   * @param interest      Faiz oranı. (Gereklidir)
   * @param kkdf          Kaynak Kullanım Destekleme Fonu. (Gereklidir)
   * @param loanStartDate İlk ödemenin tarihi .Yyyy-AA-gg biçimindedir. (Gereklidir)
   * @param loanUsingDate Kredi fonlarının alındığı tarih .yyyy-AA-gg biçiminde. (Gereklidir)
   * @param loanAmount    Kredinin miktarı. (Gereklidir)
   * @param expenseAmount Masraf tutarı. (Gereklidir)
   * @param term          Aylık vadesi. (Gereklidir)
   *
   * @return Akbank4J
   */
  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(String bsmv, String interest, String kkdf,
                                                               String loanStartDate, String loanUsingDate,
                                                               String loanAmount, String expenseAmount,
                                                               String term);

  /**
   * Kredi ödeme planı almanızı sağlar.
   *
   * <pre>{@code CreditPaymentPlanRequest creditPaymentReq = new CreditPaymentPlanRequest("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");
   * Akbank4J<CreditPaymentPlanModel> test = akbank.getCreditPaymentPlan(creditPaymentReq);}</pre>
   *
   * @param creditPaymentPlan CreditPaymentPlanRequest.class
   *
   * @return Akbank4J
   */
  public Akbank4J<CreditPaymentPlanModel> getCreditPaymentPlan(CreditPaymentPlanRequest creditPaymentPlan);

}
