package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.CreditApplicationServiceModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface ICreditApp {

  public Akbank4J<CreditApplicationServiceModel> getCreditApp(String phoneNumber, String identityNumber);

}
