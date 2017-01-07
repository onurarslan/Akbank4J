package org.akbank4j.core.api;

import org.akbank4j.core.Akbank4J;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public interface ICreditCardApp {

  public Akbank4J getCreditCardApp(String name, String secondName, String surname, String email,
                                   String phoneNumber, String identityNumber, String application);

}
