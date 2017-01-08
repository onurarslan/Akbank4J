/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akbank4j.core.request;

/**
 * This API allows you to get credit payment plan.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
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
