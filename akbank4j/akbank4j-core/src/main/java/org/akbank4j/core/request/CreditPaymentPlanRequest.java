package org.akbank4j.core.request;

import java.util.Date;
import org.akbank4j.core.Akbank4jDateUtil;

/**
 * This API allows you to get credit payment plan.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditPaymentPlanRequest {

  /** Banking and Insurance Transactions Tax Amount. (Required) */
  private String bsmv;

  /** Interest rate. (Required) */
  private String interest;

  /** Resource Utilization Support Fund. (Required) */
  private String kkdf;

  /** The date of the first payment.In the format yyyy-MM-dd. (Required) */
  private String loanStartDate;

  /** The date of loan funds are received.In the format yyyy-MM-dd. (Required) */
  private String loanUsingDate;

  /** The amount of the loan. (Required) */
  private String loanAmount;

  /** The amount of the expense. (Required) */
  private String expenseAmount;

  /** Term in months. (Required) */
  private String term;

  public CreditPaymentPlanRequest() {
  }

  /**
   * Kredi ödeme planı almanızı sağlar.
   *
   * <pre>{@code CreditPaymentPlanRequest creditPaymentReq = new CreditPaymentPlanRequest("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");}</pre>
   *
   * @param bsmv          Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı. (Gereklidir)
   * @param interest      Faiz oranı. (Gereklidir)
   * @param kkdf          Kaynak Kullanım Destekleme Fonu. (Gereklidir)
   * @param loanStartDate İlk ödemenin tarihi .Yyyy-AA-gg biçimindedir. (Gereklidir)
   * @param loanUsingDate Kredi fonlarının alındığı tarih .yyyy-AA-gg biçiminde. (Gereklidir)
   * @param loanAmount    Kredinin miktarı. (Gereklidir)
   * @param expenseAmount Masraf tutarı. (Gereklidir)
   * @param term          Aylık vadesi. (Gereklidir)
   */
  public CreditPaymentPlanRequest(String bsmv, String interest, String kkdf, String loanStartDate, String loanUsingDate,
                                  String loanAmount, String expenseAmount, String term) {
    this.bsmv = bsmv;
    this.interest = interest;
    this.kkdf = kkdf;
    this.loanStartDate = loanStartDate;
    this.loanUsingDate = loanUsingDate;
    this.loanAmount = loanAmount;
    this.expenseAmount = expenseAmount;
    this.term = term;
  }

  /**
   * Kredi ödeme planı almanızı sağlar.
   *
   * <pre>{@code CreditPaymentPlanRequest creditPaymentReq = new CreditPaymentPlanRequest(0.1234, 1.25, 0.1034, "2015-11-10", "2015-11-10", 5000, 10, 36);}</pre>
   *
   * @param bsmv          Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı. (Gereklidir)
   * @param interest      Faiz oranı. (Gereklidir)
   * @param kkdf          Kaynak Kullanım Destekleme Fonu. (Gereklidir)
   * @param loanStartDate İlk ödemenin tarihi .Yyyy-AA-gg biçimindedir. (Gereklidir)
   * @param loanUsingDate Kredi fonlarının alındığı tarih .yyyy-AA-gg biçiminde. (Gereklidir)
   * @param loanAmount    Kredinin miktarı. (Gereklidir)
   * @param expenseAmount Masraf tutarı. (Gereklidir)
   * @param term          Aylık vadesi. (Gereklidir)
   */
  public CreditPaymentPlanRequest(double bsmv, double interest, double kkdf, Date loanStartDate, Date loanUsingDate,
                                  int loanAmount, int expenseAmount, int term) {
    this.bsmv = String.valueOf(bsmv);
    this.interest = String.valueOf(interest);
    this.kkdf = String.valueOf(kkdf);
    this.loanStartDate = Akbank4jDateUtil.toAkbankFormat(loanStartDate);
    this.loanUsingDate = Akbank4jDateUtil.toAkbankFormat(loanUsingDate);
    this.loanAmount = String.valueOf(loanAmount);
    this.expenseAmount = String.valueOf(expenseAmount);
    this.term = String.valueOf(term);
  }

  public String getBsmv() {
    return bsmv;
  }

  public void setBsmv(String bsmv) {
    this.bsmv = bsmv;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public String getKkdf() {
    return kkdf;
  }

  public void setKkdf(String kkdf) {
    this.kkdf = kkdf;
  }

  public String getLoanStartDate() {
    return loanStartDate;
  }

  public void setLoanStartDate(String loanStartDate) {
    this.loanStartDate = loanStartDate;
  }

  public String getLoanUsingDate() {
    return loanUsingDate;
  }

  public void setLoanUsingDate(String loanUsingDate) {
    this.loanUsingDate = loanUsingDate;
  }

  public String getLoanAmount() {
    return loanAmount;
  }

  public void setLoanAmount(String loanAmount) {
    this.loanAmount = loanAmount;
  }

  public String getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(String expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

}
