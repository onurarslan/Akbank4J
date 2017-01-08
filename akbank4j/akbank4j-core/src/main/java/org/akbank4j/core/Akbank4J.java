package org.akbank4j.core;

import org.akbank4j.core.models.BaseModel;

/**
 * Her istekde dönen temel değerleri döndürmektedir.
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
