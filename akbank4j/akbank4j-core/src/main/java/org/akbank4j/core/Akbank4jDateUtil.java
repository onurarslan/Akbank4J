package org.akbank4j.core;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tarih tipleri için formatlama işlemi.
 *
 * @author Onur Arslan
 */
public class Akbank4jDateUtil {

  /**
   * String olan tarih formatını Date tipine çevirir.
   *
   * @param date variable
   *
   * @return Date
   */
  public static Date toDate(String date) {
    try {
      DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      return format.parse(date);
    } catch (ParseException ex) {
      Logger.getLogger(Akbank4jDateUtil.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  /**
   * Date tipini Akbank API'nin kullandığı format tipine çevirir
   *
   * @param date variable
   *
   * @return String
   */
  public static String toAkbankFormat(Date date) {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    return format.format(date);
  }

  /**
   * Date tipini Türkiye'de kullanılan tarih formatına çevirir
   *
   * @param date variable
   *
   * @return String
   */
  public static String toTurkishFormat(Date date) {
    DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    return format.format(date);
  }

}
