package org.akbank4j.core.models;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class BaseModel {

  private String returnCode;

  private String returnMessage;

  public String getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  public String getReturnMessage() {
    return returnMessage;
  }

  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }

}
