package org.akbank4j.example;

import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.ExchangeRatesModel;
import org.akbank4j.core.request.AkbankParameters;

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
    kur = akbank.getExchangeRates(AkbankParameters.ExchangeRates.DATE, "2016-02-01", false).getData();
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
    kur = akbank.getExchangeRates(AkbankParameters.ExchangeRates.CURRENCY_CODE, "002", false).getData();
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
    kur = akbank.getExchangeRates("001", "2015-10-08", true).getData();
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
