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
public class KrediUygulamasi {

  public static void main(String[] args)
          throws IOException {

    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = new Akbank(conf);

    //**********TÜKETİCİ KREDİSİ************
    CreditInterestRatesModel tuketiciKredisi = akbank.getCreditInterestRate(
            AkbankParameters.CreditInterestRates.CONSUMER_LOAN).getData();

    System.out.println("TÜKETİCİ KREDİSİ");
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

    //********MORTGAGE KREDİSİ*************/
    CreditInterestRatesModel mortgageKredi = akbank.getCreditInterestRate(
            AkbankParameters.CreditInterestRates.MORTGAGE_LOAN).getData();

    System.out.println("MORTGAGE KREDİSİ");
    System.out.println("Kredi Başlangıç Tarihi: " + mortgageKredi.getApplicationStartDate());
    System.out.println("Kredi Bitiş Tarihi: " + mortgageKredi.getApplicationEndDate());
    System.out.println("En Düşük Kredi Dönemi: " + mortgageKredi.getMinTerm());
    System.out.println("En YÜksek Kredi Dönemi: " + mortgageKredi.getMaxTerm());
    System.out.println("En Düşük Kredi Miktarı: " + mortgageKredi.getMinAmount());
    System.out.println("En Yüksek Kredi Miktarı: " + mortgageKredi.getMaxAmount());
    System.out.println("Kredi Oranı: " + mortgageKredi.getTaxRate());
    System.out.println("Fon Oranı " + mortgageKredi.getFundRate());
    System.out.println("Masraf Miktarı: " + mortgageKredi.getExpenseAmount());
    System.out.println("Faiz Dönemi: " + mortgageKredi.getInterestTerm());
    System.out.println("Faiz Sayısı: " + mortgageKredi.getInterestCount());
    System.out.println("Kredi Tutarı: " + mortgageKredi.getCreditAmount());
    System.out.println("Kredi Faizleri");
    for (CreditInterestRecord kredi : mortgageKredi.getInterestArrayList()) {
      System.out.println("En Düşük Dönem: " + kredi.getMinTerm());
      System.out.println("En Yüksek Dönem: " + kredi.getMaxTerm());
      System.out.println("Aralık: " + kredi.getRate());
      System.out.println("");
    }

    //************TAŞIT KREDİSİ*******************
    CreditInterestRatesModel tasitKredisi = akbank.getCreditInterestRate(
            AkbankParameters.CreditInterestRates.CAR_LOAN).getData();

    System.out.println("TAŞIT KREDİSİ");
    System.out.println("Kredi Başlangıç Tarihi: " + tasitKredisi.getApplicationStartDate());
    System.out.println("Kredi Bitiş Tarihi: " + tasitKredisi.getApplicationEndDate());
    System.out.println("En Düşük Kredi Dönemi: " + tasitKredisi.getMinTerm());
    System.out.println("En YÜksek Kredi Dönemi: " + tasitKredisi.getMaxTerm());
    System.out.println("En Düşük Kredi Miktarı: " + tasitKredisi.getMinAmount());
    System.out.println("En Yüksek Kredi Miktarı: " + tasitKredisi.getMaxAmount());
    System.out.println("Kredi Oranı: " + tasitKredisi.getTaxRate());
    System.out.println("Fon Oranı " + tasitKredisi.getFundRate());
    System.out.println("Masraf Miktarı: " + tasitKredisi.getExpenseAmount());
    System.out.println("Faiz Dönemi: " + tasitKredisi.getInterestTerm());
    System.out.println("Faiz Sayısı: " + tasitKredisi.getInterestCount());
    System.out.println("Kredi Tutarı: " + tasitKredisi.getCreditAmount());
    System.out.println("Kredi Faizleri");
    for (CreditInterestRecord kredi : tasitKredisi.getInterestArrayList()) {
      System.out.println("En Düşük Dönem: " + kredi.getMinTerm());
      System.out.println("En Yüksek Dönem: " + kredi.getMaxTerm());
      System.out.println("Aralık: " + kredi.getRate());
      System.out.println("");
    }

  }

}
