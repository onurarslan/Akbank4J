package org.akbank4j.example;

import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.StockValuesModel;

/**
 *
 * @author Onur Arslan
 */
public class HisseSenediDegerleri {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    StockValuesModel stokDegerleri = akbank.getStockValues("k").getData();
    System.out.println("Son Değer: " + stokDegerleri.getLast());
    System.out.println("Önceki Kapatma Değeri: " + stokDegerleri.getPreviousClose());
    System.out.println("Değişim Değeri: " + stokDegerleri.getChange());
    System.out.println("En İyi Satın Alma Fiyatı: " + stokDegerleri.getBestBuy());
    System.out.println("En Çok Satan Fiyatı: " + stokDegerleri.getBestSell());
    System.out.println("Saat: " + stokDegerleri.getHour());
    System.out.println("Hisse Senedi En Yüksek Değeri: " + stokDegerleri.getMax());
    System.out.println("Hisse Senedi Simgesi: " + stokDegerleri.getGroupSymbol());
    System.out.println("Hisse Senedi Durumu: " + stokDegerleri.getStockStatus());
    System.out.println("Hisse Senedi Simgesi: " + stokDegerleri.getSymbol());
    System.out.println("Hisse Senedi Adı: " + stokDegerleri.getName());

  }

}
