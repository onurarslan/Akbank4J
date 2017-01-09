package org.akbank4j.core.models;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class StockValuesModel {

  /** Last value. */
  private String last;

  /** Previous close value. */
  private String previousClose;

  /** Change value. */
  private String change;

  /** Best buying price. */
  private String bestBuy;

  /** Best selling price */
  private String bestSell;

  /** Current hour.(hhmmss) */
  private String hour;

  /** Peak value of stock. */
  private String max;

  /** Group symbol of stock. */
  private String groupSymbol;

  /** Status of stock. */
  private String stockStatus;

  /** Symbol of stock. */
  private String symbol;

  /** Name of stock. */
  private String name;

  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public String getPreviousClose() {
    return previousClose;
  }

  public void setPreviousClose(String previousClose) {
    this.previousClose = previousClose;
  }

  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public String getBestBuy() {
    return bestBuy;
  }

  public void setBestBuy(String bestBuy) {
    this.bestBuy = bestBuy;
  }

  public String getBestSell() {
    return bestSell;
  }

  public void setBestSell(String bestSell) {
    this.bestSell = bestSell;
  }

  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public String getMax() {
    return max;
  }

  public void setMax(String max) {
    this.max = max;
  }

  public String getGroupSymbol() {
    return groupSymbol;
  }

  public void setGroupSymbol(String groupSymbol) {
    this.groupSymbol = groupSymbol;
  }

  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
