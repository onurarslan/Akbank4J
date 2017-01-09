package org.akbank4j.core.models;

import java.util.List;
import org.akbank4j.core.records.CreditInterestRecord;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditInterestRatesModel {

  /** Loan start date.In the format yyyy-MM-dd */
  private String applicationStartDate;

  /** Loan end date.In the format yyyy-MM-dd */
  private String applicationEndDate;

  /** Minumum loan term.Term in months. */
  private String minTerm;

  /** Maximum loan term.Term in months. */
  private String maxTerm;

  /** Minimum amount of the loan. */
  private String minAmount;

  /** Maximum amount of the loan. */
  private String maxAmount;

  /** Tax rate of loan. */
  private String taxRate;

  /** Fund rate of loan. */
  private String fundRate;

  /** The amount of the expense. */
  private String expenseAmount;

  /** Interest Term. */
  private String interestTerm;

  /** Interest Count. */
  private String interestCount;

  /** Total amount of loan. */
  private String creditAmount;

  /** Interest rate on the loan. */
  private String rate;

  /** Interest minterm, maxterm and rate list */
  public List<CreditInterestRecord> interestArrayList;

  public String getApplicationStartDate() {
    return applicationStartDate;
  }

  public void setApplicationStartDate(String applicationStartDate) {
    this.applicationStartDate = applicationStartDate;
  }

  public String getApplicationEndDate() {
    return applicationEndDate;
  }

  public void setApplicationEndDate(String applicationEndDate) {
    this.applicationEndDate = applicationEndDate;
  }

  public String getMinTerm() {
    return minTerm;
  }

  public void setMinTerm(String minTerm) {
    this.minTerm = minTerm;
  }

  public String getMaxTerm() {
    return maxTerm;
  }

  public void setMaxTerm(String maxTerm) {
    this.maxTerm = maxTerm;
  }

  public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }

  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }

  public String getFundRate() {
    return fundRate;
  }

  public void setFundRate(String fundRate) {
    this.fundRate = fundRate;
  }

  public String getExpenseAmount() {
    return expenseAmount;
  }

  public void setExpenseAmount(String expenseAmount) {
    this.expenseAmount = expenseAmount;
  }

  public String getInterestTerm() {
    return interestTerm;
  }

  public void setInterestTerm(String interestTerm) {
    this.interestTerm = interestTerm;
  }

  public String getInterestCount() {
    return interestCount;
  }

  public void setInterestCount(String interestCount) {
    this.interestCount = interestCount;
  }

  public String getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(String creditAmount) {
    this.creditAmount = creditAmount;
  }

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public List<CreditInterestRecord> getInterestArrayList() {
    return interestArrayList;
  }

  public void setInterestArrayList(List<CreditInterestRecord> interestArrayList) {
    this.interestArrayList = interestArrayList;
  }

}
