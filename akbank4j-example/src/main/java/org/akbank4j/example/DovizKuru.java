package org.akbank4j.example;

import java.sql.Date;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.ExchangeRatesModel;

/**
 *
 * @author onur
 */
public class DovizKuru {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    //***************PARAMETRESİS********************************//
    ExchangeRatesModel kur = akbank.getExchangeRates().getData();
    System.out.println("Satış Fiyatı: " + kur.getSellPrice());
    System.out.println("Alış Fiyatı: " + kur.getBuyPrice());
    System.out.println("USD Çapraz Kur: " + kur.getUsdCrossRate());
    System.out.println("Parite: " + kur.getParity());
    System.out.println("Para Birimi Kodu: " + kur.getCurrencyCode());
    System.out.println("Banknot Alış: " + kur.getBanknoteBuying());
    System.out.println("Banknot Satış: " + kur.getBanknoteSelling());
    System.out.println("Para Birimi Alfa Kodu: " + kur.getCurrencyCodeAlpha());
    System.out.println("Birim: " + kur.getUnit());
    System.out.println();

    //****************TEK PARAMETRE TARİH*************///////
    Date date = Date.valueOf("2016-02-01");
    kur = akbank.getExchangeRates(date).getData();
    System.out.println("Satış Fiyatı: " + kur.getSellPrice());
    System.out.println("Alış Fiyatı: " + kur.getBuyPrice());
    System.out.println("USD Çapraz Kur: " + kur.getUsdCrossRate());
    System.out.println("Parite: " + kur.getParity());
    System.out.println("Para Birimi Kodu: " + kur.getCurrencyCode());
    System.out.println("Banknot Alış: " + kur.getBanknoteBuying());
    System.out.println("Banknot Satış: " + kur.getBanknoteSelling());
    System.out.println("Para Birimi Alfa Kodu: " + kur.getCurrencyCodeAlpha());
    System.out.println("Birim: " + kur.getUnit());
    System.out.println();

    //*********************TEK PAREMETRE PARA BİRİMİ KODU********************
    kur = akbank.getExchangeRates("002").getData();
    System.out.println("Satış Fiyatı: " + kur.getSellPrice());
    System.out.println("Alış Fiyatı: " + kur.getBuyPrice());
    System.out.println("USD Çapraz Kur: " + kur.getUsdCrossRate());
    System.out.println("Parite: " + kur.getParity());
    System.out.println("Para Birimi Kodu: " + kur.getCurrencyCode());
    System.out.println("Banknot Alış: " + kur.getBanknoteBuying());
    System.out.println("Banknot Satış: " + kur.getBanknoteSelling());
    System.out.println("Para Birimi Alfa Kodu: " + kur.getCurrencyCodeAlpha());
    System.out.println("Birim: " + kur.getUnit());
    System.out.println();

    //*******************İKİ PARAMETRE*******************////
    kur = akbank.getExchangeRates("001", date).getData();
    System.out.println("Satış Fiyatı: " + kur.getSellPrice());
    System.out.println("Alış Fiyatı: " + kur.getBuyPrice());
    System.out.println("USD Çapraz Kur: " + kur.getUsdCrossRate());
    System.out.println("Parite: " + kur.getParity());
    System.out.println("Para Birimi Kodu: " + kur.getCurrencyCode());
    System.out.println("Banknot Alış: " + kur.getBanknoteBuying());
    System.out.println("Banknot Satış: " + kur.getBanknoteSelling());
    System.out.println("Para Birimi Alfa Kodu: " + kur.getCurrencyCodeAlpha());
    System.out.println("Birim: " + kur.getUnit());
    System.out.println();

  }
}
