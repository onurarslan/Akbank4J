package org.akbank4j.core.models;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
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
