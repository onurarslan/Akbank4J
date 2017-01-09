package org.akbank4j.core.records;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditInterestRecord {

  /** Minumum loan term.Term in months. */
  private String minTerm;

  /** Maximum loan term.Term in months. */
  private String maxTerm;

  /** Interest rate on the loan. */
  private String rate;

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

  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

}
