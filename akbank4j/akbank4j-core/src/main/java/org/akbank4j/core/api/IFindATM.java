package org.akbank4j.core.api;

import java.util.List;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.FindAtmModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface IFindATM {

  public Akbank4J<List<FindAtmModel>> getFindATM(String latitude, String longitude, String radius,
                                                 String city, String district,
                                                 String searchText);

}
