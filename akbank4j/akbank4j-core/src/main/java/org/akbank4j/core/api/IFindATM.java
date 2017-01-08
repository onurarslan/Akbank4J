package org.akbank4j.core.api;

import java.util.List;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FindAtmModel;
import org.akbank4j.core.request.FindRequest;

/**
 * Bu API belirtilen arama alanında ATM bulmanızı sağlar.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindATM {

  /**
   * Belirtilen arama alanında ATM bulmanızı sağlar.
   * <pre>{@code Akbank4J<List<FindAtmModel>> findATM = akbank.getFindATM("41.008238", "28.978359", "1000", null, null, null);}</pre>
   *
   * @param latitude   Enlem
   * @param longitude  Boylam
   * @param radius     Yarıçap
   * @param city       İl
   * @param district   İlçe
   * @param searchText Arama Metni
   *
   * @return Akbank4J<List<FindAtmModel>>
   */
  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText);

  /**
   * Belirtilen arama alanında ATM bulmanızı sağlar.
   * <pre>{@code Akbank4J<List<FindAtmModel>> findATM = akbank.getFindATM("41.008238", "28.978359", "1000");}</pre>
   *
   * @param latitude  Enlem
   * @param longitude Boylam
   * @param radius    Yarıçap
   *
   * @return Akbank4J<List<FindAtmModel>>
   */
  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius);

  /**
   * Belirtilen arama alanında ATM bulmanızı sağlar.
   * <pre>{@code FindRequest atmReq = new FindRequest("41.008238", "28.978359", "1000", null, null, null);
   * Akbank4J<List<FindAtmModel>> findATM = akbank.getFindATM(atmReq);}</pre>
   *
   * @param findATM FindRequest.class
   *
   * @return Akbank4J<List<FindAtmModel>>
   */
  public Akbank4J<List<FindAtmModel>> getFindATM(FindRequest findATM);

}
