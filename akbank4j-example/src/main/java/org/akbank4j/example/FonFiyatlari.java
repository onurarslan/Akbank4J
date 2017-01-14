package org.akbank4j.example;

import java.util.List;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.records.FundRecords;
import org.akbank4j.core.request.AkbankParameters;

/**
 *
 * @author Onur Arslan
 */
public class FonFiyatlari {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    //**********  A TİPİ FONLAR ******////////////
    List<FundRecords> fonFiyatlari = akbank.getFundPrices(AkbankParameters.FundPrices.TYPE_A).getData().getFundRecords();
    for (FundRecords fon : fonFiyatlari) {
      System.out.println("Fon KIsa Adı: " + fon.getFundShortName());
      System.out.println("Fon Adı: " + fon.getFundName());
      System.out.println("Fon Tipi: " + fon.getFundType());
      System.out.println("Satış Fiyatı: " + fon.getBuyPrice());
      System.out.println("Alış Fiyatı: " + fon.getSellPrice());
      System.out.println("Fon Tipi Açıklaması: " + fon.getFundTypeDescription());
    }

    //**********  B TİPİ FONLAR *********//////
    fonFiyatlari = akbank.getFundPrices(AkbankParameters.FundPrices.TYPE_B).getData().getFundRecords();
    for (FundRecords fon : fonFiyatlari) {
      System.out.println("Fon KIsa Adı: " + fon.getFundShortName());
      System.out.println("Fon Adı: " + fon.getFundName());
      System.out.println("Fon Tipi: " + fon.getFundType());
      System.out.println("Satış Fiyatı: " + fon.getBuyPrice());
      System.out.println("Alış Fiyatı: " + fon.getSellPrice());
      System.out.println("Fon Tipi Açıklaması: " + fon.getFundTypeDescription());
    }

    //********* TÜM FON TİPLERİ *****//////////
    fonFiyatlari = akbank.getFundPrices(AkbankParameters.FundPrices.ALL).getData().getFundRecords();
    for (FundRecords fon : fonFiyatlari) {
      System.out.println("Fon KIsa Adı: " + fon.getFundShortName());
      System.out.println("Fon Adı: " + fon.getFundName());
      System.out.println("Fon Tipi: " + fon.getFundType());
      System.out.println("Satış Fiyatı: " + fon.getBuyPrice());
      System.out.println("Alış Fiyatı: " + fon.getSellPrice());
      System.out.println("Fon Tipi Açıklaması: " + fon.getFundTypeDescription());
    }

  }

}
