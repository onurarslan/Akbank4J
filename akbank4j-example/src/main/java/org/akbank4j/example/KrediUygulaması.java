package org.akbank4j.example;

import java.io.IOException;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.CreditInterestRatesModel;
import org.akbank4j.core.records.CreditInterestRecord;
import org.akbank4j.core.request.AkbankParameters;

/**
 * Tüketici Kredisi örnek uygulama
 *
 * @author Onur Arslan
 */
public class KrediUygulaması {

  public static void main(String[] args)
          throws IOException {

    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = new Akbank(conf);

    CreditInterestRatesModel tuketiciKredisi = akbank.getCreditInterestRate(
            AkbankParameters.CreditInterestRates.CONSUMER_LOAN).getData();

    System.out.println("Kredi Başlangıç Tarihi: " + tuketiciKredisi.getApplicationStartDate());
    System.out.println("Kredi Bitiş Tarihi: " + tuketiciKredisi.getApplicationEndDate());
    System.out.println("En Düşük Kredi Dönemi: " + tuketiciKredisi.getMinTerm());
    System.out.println("En YÜksek Kredi Dönemi: " + tuketiciKredisi.getMaxTerm());
    System.out.println("En Düşük Kredi Miktarı: " + tuketiciKredisi.getMinAmount());
    System.out.println("En Yüksek Kredi Miktarı: " + tuketiciKredisi.getMaxAmount());
    System.out.println("Kredi Oranı: " + tuketiciKredisi.getTaxRate());
    System.out.println("Fon Oranı " + tuketiciKredisi.getFundRate());
    System.out.println("Masraf Miktarı: " + tuketiciKredisi.getExpenseAmount());
    System.out.println("Faiz Dönemi: " + tuketiciKredisi.getInterestTerm());
    System.out.println("Faiz Sayısı: " + tuketiciKredisi.getInterestCount());
    System.out.println("Kredi Tutarı: " + tuketiciKredisi.getCreditAmount());
    System.out.println("Kredi Faizleri");
    for (CreditInterestRecord kredi : tuketiciKredisi.getInterestArrayList()) {
      System.out.println("En Düşük Dönem: " + kredi.getMinTerm());
      System.out.println("En Yüksek Dönem: " + kredi.getMaxTerm());
      System.out.println("Aralık: " + kredi.getRate());
      System.out.println("");
    }

  }

}
