package org.akbank4j.core.records;

/**
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class FindBranchRecords {

  /** True if the branch has ATM. */
  private boolean hasAtm;

  /** True if the branch open on weekend. */
  private boolean isOpenOnWeekend;

  /** True if the branch open at noon. */
  private boolean isOpenAtNoon;

  /** Latitude of branch location. */
  private String latitude;

  /** Longitude of branch location */
  private String longitude;

  /** Phone number of the branch */
  private String phoneNumber;

  /** True if the branch has safe deposit box. */
  private boolean hasSafeBox;

  public boolean isHasAtm() {
    return hasAtm;
  }

  public void setHasAtm(boolean hasAtm) {
    this.hasAtm = hasAtm;
  }

  public boolean isIsOpenOnWeekend() {
    return isOpenOnWeekend;
  }

  public void setIsOpenOnWeekend(boolean isOpenOnWeekend) {
    this.isOpenOnWeekend = isOpenOnWeekend;
  }

  public boolean isIsOpenAtNoon() {
    return isOpenAtNoon;
  }

  public void setIsOpenAtNoon(boolean isOpenAtNoon) {
    this.isOpenAtNoon = isOpenAtNoon;
  }

  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean isHasSafeBox() {
    return hasSafeBox;
  }

  public void setHasSafeBox(boolean hasSafeBox) {
    this.hasSafeBox = hasSafeBox;
  }

}
