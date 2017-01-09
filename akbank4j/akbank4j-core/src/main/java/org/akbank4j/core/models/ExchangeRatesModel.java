package org.akbank4j.core.models;

/**
 * Exchange Rates API allows you to get current and historical exchange rates.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class ExchangeRatesModel {

  /** Selling rate of exchange */
  private String sellPrice;

  /** Buying rate of exchange */
  private String buyPrice;

  /** USD Cross Rate */
  private String usdCrossRate;

  /** Parity */
  private String parity;

  /** Currency Code(Numerical) */
  private String currencyCode;

  /** Banknote Buying */
  private String banknoteBuying;

  /** Currency Code(Alpha-3) */
  private String currencyCodeAlpha;

  /** Banknote Selling */
  private String banknoteSelling;

  /** Unit (Y:100, B:1) */
  private String unit;

  public String getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(String sellPrice) {
    this.sellPrice = sellPrice;
  }

  public String getBuyPrice() {
    return buyPrice;
  }

  public void setBuyPrice(String buyPrice) {
    this.buyPrice = buyPrice;
  }

  public String getUsdCrossRate() {
    return usdCrossRate;
  }

  public void setUsdCrossRate(String usdCrossRate) {
    this.usdCrossRate = usdCrossRate;
  }

  public String getParity() {
    return parity;
  }

  public void setParity(String parity) {
    this.parity = parity;
  }

  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public String getBanknoteBuying() {
    return banknoteBuying;
  }

  public void setBanknoteBuying(String banknoteBuying) {
    this.banknoteBuying = banknoteBuying;
  }

  public String getCurrencyCodeAlpha() {
    return currencyCodeAlpha;
  }

  public void setCurrencyCodeAlpha(String currencyCodeAlpha) {
    this.currencyCodeAlpha = currencyCodeAlpha;
  }

  public String getBanknoteSelling() {
    return banknoteSelling;
  }

  public void setBanknoteSelling(String banknoteSelling) {
    this.banknoteSelling = banknoteSelling;
  }

  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

}
