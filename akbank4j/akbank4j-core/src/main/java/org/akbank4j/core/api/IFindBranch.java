package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FindBranchModel;
import org.akbank4j.core.request.FindRequest;

/**
 * Bu API belirtilen arama alanında yakın şube bulmanızı sağlar.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindBranch {

  /**
   * Belirtilen arama alanında yakın şube bulmanızı sağlar.
   * <pre>{@code Akbank4J<FindBranchModel> findBranch = akbank.getFindBranch("41.008238", "28.978359", "1000", null, null, null);}</pre>
   *
   * @param latitude   Enlem
   * @param longitude  Boylam
   * @param radius     Yarıçap
   * @param city       İl
   * @param district   İlçe
   * @param searchText Arama Metni
   *
   * @return Akbank4J<FindBranchModel>
   */
  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText);

  /**
   * Belirtilen arama alanında yakın şube bulmanızı sağlar.
   * <pre>{@code Akbank4J<FindBranchModel> findBranch = akbank.getFindBranch("41.008238", "28.978359", "1000");}</pre>
   *
   * @param latitude  Enlem
   * @param longitude Boylam
   * @param radius    Yarıçap
   *
   * @return Akbank4J<FindBranchModel>
   */
  public Akbank4J<FindBranchModel> getFindBranch(String latitude, String longitude, String radius);

  /**
   * Belirtilen arama alanında yakın şube bulmanızı sağlar.
   * <pre>{@code FindRequest branchReq = new FindRequest("41.008238", "28.978359", "1000", null, null, null);
   * Akbank4J<FindBranchModel> findBranch = akbank.getFindBranch(branchReq);}</pre>
   *
   * @param findBranch FindRequest.class
   *
   * @return Akbank4J<FindBranchModel>
   */
  public Akbank4J<FindBranchModel> getFindBranch(FindRequest findBranch);

}
