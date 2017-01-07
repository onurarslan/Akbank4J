package org.akbank4j.core;

import org.akbank4j.core.models.BaseModel;

/**
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class Akbank4J<T>
        extends BaseModel {

  private T data;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

}
