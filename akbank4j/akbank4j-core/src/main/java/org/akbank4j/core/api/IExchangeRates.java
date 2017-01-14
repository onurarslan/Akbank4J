package org.akbank4j.core.api;

import java.util.Date;
import org.akbank4j.core.Akbank4J;
import org.akbank4j.core.models.ExchangeRatesModel;

/**
 * ExchangeRates API size güncel ve geçmiş döviz kurları edinmenize izin verir.
 *
 * @author <a href="mailto:arslan.onur.41@gmail.com">Onur Arslan </a> onurarslan.org
 */
public interface IExchangeRates {

  /**
   * Güncel dövüz kuru verir.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates();}</pre>
   *
   * @return Akbank4J
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates();

  /** Para Birimi Koduna göre döviz kuru bilgisi edinmenizi sağlar.
   * <pre>{@code Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates("002");}</pre>
   *
   * @param currencyCode Para Birimi Kodu
   *
   * @return Akbank4J
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String currencyCode);

  /**
   * Beliritlen tarihe göre döviz kuru bilgisi edinmenizi sağlar.
   *
   * <pre>{@code Date date = Date.valueOf("2015-10-08");
   * Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates(date);}</pre>
   *
   * @param date Tarih
   *
   * @return Akbank4J
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates(Date date);

  /**
   * Tanımlanan para birimi kodunu, tanımlanan tarihte ki bilgisini edinmenizi sağlar.
   * <pre>{@code Date date = Date.valueOf("2015-10-08");
   * Akbank4J<ExchangeRatesModel> exchangeRate = akbank.getExchangeRates("002", date);}</pre>
   *
   * @param currencyCode Para Birimi Kodu
   * @param date         Tarih
   *
   * @return Akbank4J
   */
  public Akbank4J<ExchangeRatesModel> getExchangeRates(String currencyCode, Date date);

}
