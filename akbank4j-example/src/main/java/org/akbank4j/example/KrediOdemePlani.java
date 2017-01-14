package org.akbank4j.example;

import java.sql.Date;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.CreditPaymentPlanModel;
import org.akbank4j.core.records.CreditPaymentPlanRecords;
import org.akbank4j.core.request.CreditPaymentPlanRequest;

/**
 * Kredi ödeme planı almanızı sağlar.
 *
 * @author Onur Arslan
 */
public class KrediOdemePlani {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    //*****************PARAMETRE NESNE KULLANMADAN****************//
    CreditPaymentPlanModel krediOdemePlani = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10",
                                                                         "2015-11-10", "5000", "10", "36").getData();
    for (CreditPaymentPlanRecords krediKayitlari : krediOdemePlani.getPaymentPlanList()) {
      System.out.println("Anapara Tutarı: " + krediKayitlari.getPrincipal());
      System.out.println("Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı: " + krediKayitlari.getBitt());
      System.out.println("Fiz Miktarı: " + krediKayitlari.getInterest());
      System.out.println("Kalan Anapara Miktarı: " + krediKayitlari.getRemainingPrincipal());
      System.out.println("Kaynak Kullanımı Destekleme Fonu: " + krediKayitlari.getKkdf());
      System.out.println("Dönem Sayısı: " + krediKayitlari.getPeriod());
      System.out.println("Taksit Miktarı: " + krediKayitlari.getMonthlyPayment());
      System.out.println("Kredi Ödeme Tarihi: " + krediKayitlari.getDate());
      System.out.println();
    }

    //*****************PARAMETRE NESNE KULLANMADAN STRİNG HARİÇ TİPLER*******/////////
    Date startDate = Date.valueOf("2015-11-10");
    Date usingDate = Date.valueOf("2015-11-10");
    krediOdemePlani = akbank.getCreditPaymentPlan(0.1234, 1.25, 0.1034, startDate, usingDate, 5000, 10, 36).getData();
    for (CreditPaymentPlanRecords krediKayitlari : krediOdemePlani.getPaymentPlanList()) {
      System.out.println("Anapara Tutarı: " + krediKayitlari.getPrincipal());
      System.out.println("Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı: " + krediKayitlari.getBitt());
      System.out.println("Fiz Miktarı: " + krediKayitlari.getInterest());
      System.out.println("Kalan Anapara Miktarı: " + krediKayitlari.getRemainingPrincipal());
      System.out.println("Kaynak Kullanımı Destekleme Fonu: " + krediKayitlari.getKkdf());
      System.out.println("Dönem Sayısı: " + krediKayitlari.getPeriod());
      System.out.println("Taksit Miktarı: " + krediKayitlari.getMonthlyPayment());
      System.out.println("Kredi Ödeme Tarihi: " + krediKayitlari.getDate());
      System.out.println();
    }

    //************PARAMETRE NESNE KULLANARAK*************************//
    CreditPaymentPlanRequest krediOdemePlaniParam = new CreditPaymentPlanRequest("0.1234", "1.25", "0.1034",
                                                                                 "2015-11-10", "2015-11-10",
                                                                                 "5000", "10", "36");
    krediOdemePlani = akbank.getCreditPaymentPlan(krediOdemePlaniParam).getData();
    for (CreditPaymentPlanRecords krediKayitlari : krediOdemePlani.getPaymentPlanList()) {
      System.out.println("Anapara Tutarı: " + krediKayitlari.getPrincipal());
      System.out.println("Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı: " + krediKayitlari.getBitt());
      System.out.println("Fiz Miktarı: " + krediKayitlari.getInterest());
      System.out.println("Kalan Anapara Miktarı: " + krediKayitlari.getRemainingPrincipal());
      System.out.println("Kaynak Kullanımı Destekleme Fonu: " + krediKayitlari.getKkdf());
      System.out.println("Dönem Sayısı: " + krediKayitlari.getPeriod());
      System.out.println("Taksit Miktarı: " + krediKayitlari.getMonthlyPayment());
      System.out.println("Kredi Ödeme Tarihi: " + krediKayitlari.getDate());
      System.out.println();
    }

    //**********PARAMETRE NESNE KULLANARAK STRİNG HARİÇ TİPLER*****///////////////
    krediOdemePlaniParam = new CreditPaymentPlanRequest(0.1234, 1.25, 0.1034, startDate, usingDate, 5000, 10, 36);
    krediOdemePlani = akbank.getCreditPaymentPlan(krediOdemePlaniParam).getData();
    for (CreditPaymentPlanRecords krediKayitlari : krediOdemePlani.getPaymentPlanList()) {
      System.out.println("Anapara Tutarı: " + krediKayitlari.getPrincipal());
      System.out.println("Bankacılık ve Sigortacılık İşlemleri Vergisi Tutarı: " + krediKayitlari.getBitt());
      System.out.println("Fiz Miktarı: " + krediKayitlari.getInterest());
      System.out.println("Kalan Anapara Miktarı: " + krediKayitlari.getRemainingPrincipal());
      System.out.println("Kaynak Kullanımı Destekleme Fonu: " + krediKayitlari.getKkdf());
      System.out.println("Dönem Sayısı: " + krediKayitlari.getPeriod());
      System.out.println("Taksit Miktarı: " + krediKayitlari.getMonthlyPayment());
      System.out.println("Kredi Ödeme Tarihi: " + krediKayitlari.getDate());
      System.out.println();
    }

  }

}
