package org.akbank4j.core.records;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class FundRecords {

  /** The short name for the Fund. */
  private String fundShortName;

  /** The descriptive name for the Fund. */
  private String fundName;

  /** A : Type A, B :Type B, T : All. */
  private String fundType;

  /** Buying price of Fund. */
  private String buyPrice;

  /** Selling price of Fund. */
  private String sellPrice;

  /** Description for fund type (Likit,Karma etc.) */
  private String fundTypeDescription;

  public String getFundShortName() {
    return fundShortName;
  }

  public void setFundShortName(String fundShortName) {
    this.fundShortName = fundShortName;
  }

  public String getFundName() {
    return fundName;
  }

  public void setFundName(String fundName) {
    this.fundName = fundName;
  }

  public String getFundType() {
    return fundType;
  }

  public void setFundType(String fundType) {
    this.fundType = fundType;
  }

  public String getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(String buyPrice) {
    this.buyPrice = buyPrice;
  }

  public String getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }

  public String getFundTypeDescription() {
    return fundTypeDescription;
  }

  public void setFundTypeDescription(String fundTypeDescription) {
    this.fundTypeDescription = fundTypeDescription;
  }

}
