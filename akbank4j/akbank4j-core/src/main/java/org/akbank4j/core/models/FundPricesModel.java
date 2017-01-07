package org.akbank4j.core.models;

import java.util.List;
import org.akbank4j.core.records.FundRecords;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class FundPricesModel {

  private List<FundRecords> fundRecords;

  public List<FundRecords> getFundRecords() {
    return fundRecords;
  }

  public void setFundRecords(List<FundRecords> fundRecords) {
    this.fundRecords = fundRecords;
  }

}
