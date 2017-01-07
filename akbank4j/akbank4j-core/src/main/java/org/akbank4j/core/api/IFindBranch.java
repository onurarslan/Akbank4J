package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FindBranchModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindBranch {

  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText);

}
