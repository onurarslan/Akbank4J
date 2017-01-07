package org.akbank4j.core.models;

import java.util.List;
import org.akbank4j.core.records.FindBranchRecords;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class FindBranchModel {

  private List<FindBranchRecords> branchRecords;

  public List<FindBranchRecords> getBranchRecords() {
    return branchRecords;
  }

  public void setBranchRecords(List<FindBranchRecords> branchRecords) {
    this.branchRecords = branchRecords;
  }

}
