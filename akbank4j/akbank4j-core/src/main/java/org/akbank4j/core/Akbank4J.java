package org.akbank4j.core;

import org.akbank4j.core.models.BaseModel;

/**
 * Her istekde dönen temel değerleri döndürmektedir.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
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
