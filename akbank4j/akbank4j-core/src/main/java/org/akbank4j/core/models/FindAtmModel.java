package org.akbank4j.core.models;

/**
 * This API allows you to find ATMs in the specified search area.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public class FindAtmModel {

  /** City of ATM. */
  private String city;

  /** District of ATM. */
  private String district;

  /** Address of ATM. */
  private String address;

  /** Name of ATM. */
  private String name;

  /** Latitude of ATM location. */
  private String latitude;

  /** Longitude of ATM location. */
  private String longitude;

  /** ATM or BTM */
  private String deviceType;

  /** This indicates whether the ATM applicable to the foreign exchange. */
  private boolean exchangeAvailable;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public boolean isExchangeAvailable() {
    return exchangeAvailable;
  }

  public void setExchangeAvailable(boolean exchangeAvailable) {
    this.exchangeAvailable = exchangeAvailable;
  }

}
