package org.akbank4j.example;

import java.util.List;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.FindAtmModel;
import org.akbank4j.core.request.FindRequest;

/**
 *
 * @author Onur Arslan
 */
public class AtmBul {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    //**********TAM PARAMETRE LİSTESİ**********//
    List<FindAtmModel> yakinATM = akbank.getFindATM("41.008238", "28.978359,", "1000", null, null, null).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //**********TAM PARAMETRE LİSTESİ STRİNG HARİÇ TİPLER**********//
    yakinATM = akbank.getFindATM(41.008238, 28.978359, 1000, null, null, null).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //**********AZLATILMIŞ PARAMETRE LİSTESİ************//
    yakinATM = akbank.getFindATM("41.008238", "28.978359,", "1000").getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //**********AZLATILMIŞ PARAMETRE LİSTESİ STRING HARİÇ TİPLER************//
    yakinATM = akbank.getFindATM(41.008238, 28.978359, 1000).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //***************TAM PARAMETRE LİSTESİ NESNE******/////////////
    FindRequest atmFind = new FindRequest("41.008238", "28.978359,", "1000", null, null, null);
    yakinATM = akbank.getFindATM(atmFind).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //***************TAM PARAMETRE LİSTESİ NESNE STRING HARİÇ TİPLER******/////////////
    atmFind = new FindRequest(41.008238, 28.978359, 1000, null, null, null);
    yakinATM = akbank.getFindATM(atmFind).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //***********AZALTILMIŞ PARAMETRE LİSTESİ NESNE******////
    atmFind = new FindRequest("41.008238", "28.978359,", "1000");
    yakinATM = akbank.getFindATM(atmFind).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

    //***********AZALTILMIŞ PARAMETRE LİSTESİ NESNE STRING HARİÇ TİLER******////
    atmFind = new FindRequest(41.008238, 28.978359, 1000);
    yakinATM = akbank.getFindATM(atmFind).getData();
    for (FindAtmModel atm : yakinATM) {
      System.out.println("Şehir: " + atm.getCity());
      System.out.println("Bölge: " + atm.getDistrict());
      System.out.println("Adres: " + atm.getAddress());
      System.out.println("ATM Adı: " + atm.getName());
      System.out.println("Enlem: " + atm.getLatitude());
      System.out.println("Boylam: " + atm.getLongitude());
      System.out.println("ATM/BTM: " + atm.getDeviceType());
      System.out.println("Exchange İzni: " + atm.isExchangeAvailable());
      System.out.println();
    }

  }

}
