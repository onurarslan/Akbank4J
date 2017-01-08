/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akbank4j.core.request;

/**
 * This API allows you to find ATMs in the specified search area or This API allows you to find nearest branches in the
 * specified search area.
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class FindRequest {

  /** Latitude of geo-point to search near. If longitude or radius is provided, latitude must also be provided. */
  private String latitude;

  /** Longitude of geo-point to search near. If langitude or radius is provided, longitude must also be provided. */
  private String longitude;

  /** Defines the distance (in meters) within which to return place results. If langitude or longitude is provided,
   * radius must also be provided. */
  private String radius;

  /** City of ATM or branch. (Optional) */
  private String city;

  /** District of ATM or branch. (Optional) */
  private String district;

  /** The text string on which to search, for example: "İstanbul", "akbank", "ank". (Optional) */
  private String searchText;

  public FindRequest() {
  }

  public FindRequest(String latitude, String longitude, String radius) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.radius = radius;
    this.city = null;
    this.district = null;
    this.searchText = null;
  }

  public FindRequest(String latitude, String longitude, String radius,
                     String city, String district, String searchText) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.radius = radius;
    this.city = city;
    this.district = district;
    this.searchText = searchText;
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

  public String getRadius() {
    return radius;
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

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

  public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

}
