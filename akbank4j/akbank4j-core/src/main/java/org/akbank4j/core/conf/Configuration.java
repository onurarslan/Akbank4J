package org.akbank4j.core.conf;

/**
 * API Konfigurasyonu
 *
 * @author Onur Arslan <arslan.onur.41@gmail.com> onurarslan.org
 */
public class Configuration {

  private String name;

  private String value;

  /**
   * Konfigurasyon ayarları akbank api'den elde ettiğiniz api adı ve api key yazılmalıdır.
   * {@code Configuration conf = new Configuration("your_api_key_name", "your_api_key");}</pre>
   *
   * @param name
   * @param value
   */
  public Configuration(String name, String value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

}
