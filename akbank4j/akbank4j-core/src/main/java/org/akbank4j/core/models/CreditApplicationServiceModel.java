package org.akbank4j.core.models;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class CreditApplicationServiceModel {

  /** Data contains reference number(CreditRefNo) of your application. */
  private String smsCreditRefNo;

  public String getSmsCreditRefNo() {
    return smsCreditRefNo;
  }

  public void setSmsCreditRefNo(String smsCreditRefNo) {
    this.smsCreditRefNo = smsCreditRefNo;
  }

}
