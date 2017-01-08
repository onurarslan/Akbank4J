package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FindBranchModel;
import org.akbank4j.core.request.FindRequest;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindBranch {

  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText);

  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius);

  public Akbank4J<FindBranchModel> getFindBranch(FindRequest findBranch);

}
