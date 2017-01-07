package org.akbank4j.core.records;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class CreditPaymentPlanRecords {

  /** The amount of principal. */
  private String principal;

  /** The amount of rediscount monthly. */
  private String monthlyRediscount;

  /** Banking and Insurance Transactions Tax Amount. */
  private String bitt;

  /** The amount of interest. */
  private String interest;

  /** The amount of remaining principal. */
  private String remainingPrincipal;

  /** Resource Utilization Support Fund. */
  private String kkdf;

  /** Number of period */
  private String period;

  /** Installment amount. */
  private String monthlyPayment;

  /** Loan payment date. In the format yyyy-MM-dd. */
  private String date;

  public String getPrincipal() {
    return principal;
  }

  public void setPrincipal(String principal) {
    this.principal = principal;
  }

  public String getMonthlyRediscount() {
    return monthlyRediscount;
  }

  public void setMonthlyRediscount(String monthlyRediscount) {
    this.monthlyRediscount = monthlyRediscount;
  }

  public String getBitt() {
    return bitt;
  }

  public void setBitt(String bitt) {
    this.bitt = bitt;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public String getRemainingPrincipal() {
    return remainingPrincipal;
  }

  public void setRemainingPrincipal(String remainingPrincipal) {
    this.remainingPrincipal = remainingPrincipal;
  }

  public String getKkdf() {
    return kkdf;
  }

  public void setKkdf(String kkdf) {
    this.kkdf = kkdf;
  }

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(String monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

}
