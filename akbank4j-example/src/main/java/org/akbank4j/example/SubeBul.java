package org.akbank4j.example;

import java.util.List;
import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.records.FindBranchRecords;
import org.akbank4j.core.request.FindRequest;

/**
 *
 * @author Onur Arslan
 */
public class SubeBul {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = Akbank.getInstance(conf);

    //*******TAM PARAMETRE LİSTE****//////
    List<FindBranchRecords> yakinSube = akbank.getFindBranch("41.008238", "28.978359,", "1000", null, null, null).
            getData().getBranchRecords();
    for (FindBranchRecords sube : yakinSube) {
      System.out.println("ATM Var Mı: " + sube.isHasAtm());
      System.out.println("Haftasonları Açık Mı: " + sube.isIsOpenOnWeekend());
      System.out.println("Şube Adı: " + sube.getName());
      System.out.println("Öğle Vakti Açık Mı:" + sube.isIsOpenAtNoon());
      System.out.println("Enlem: " + sube.getLatitude());
      System.out.println("Boylam: " + sube.getLongitude());
      System.out.println("Telefon NUmarası: " + sube.getPhoneNumber());
      System.out.println("Güvenli Kasaya Sahip Mi: " + sube.isHasSafeBox());
      System.out.println();
    }

    //**********AZALTILMIŞ PARAMETRE LİSTE**********/////
    yakinSube = akbank.getFindBranch("41.008238", "28.978359,", "1000").getData().getBranchRecords();
    for (FindBranchRecords sube : yakinSube) {
      System.out.println("ATM Var Mı: " + sube.isHasAtm());
      System.out.println("Haftasonları Açık Mı: " + sube.isIsOpenOnWeekend());
      System.out.println("Şube Adı: " + sube.getName());
      System.out.println("Öğle Vakti Açık Mı:" + sube.isIsOpenAtNoon());
      System.out.println("Enlem: " + sube.getLatitude());
      System.out.println("Boylam: " + sube.getLongitude());
      System.out.println("Telefon NUmarası: " + sube.getPhoneNumber());
      System.out.println("Güvenli Kasaya Sahip Mi: " + sube.isHasSafeBox());
      System.out.println();
    }

    //********TAM PARAMETRE LİSTE NESNE********//
    FindRequest subeBul = new FindRequest("41.008238", "28.978359,", "1000", null, null, null);
    yakinSube = akbank.getFindBranch(subeBul).getData().getBranchRecords();
    for (FindBranchRecords sube : yakinSube) {
      System.out.println("ATM Var Mı: " + sube.isHasAtm());
      System.out.println("Haftasonları Açık Mı: " + sube.isIsOpenOnWeekend());
      System.out.println("Şube Adı: " + sube.getName());
      System.out.println("Öğle Vakti Açık Mı:" + sube.isIsOpenAtNoon());
      System.out.println("Enlem: " + sube.getLatitude());
      System.out.println("Boylam: " + sube.getLongitude());
      System.out.println("Telefon NUmarası: " + sube.getPhoneNumber());
      System.out.println("Güvenli Kasaya Sahip Mi: " + sube.isHasSafeBox());
      System.out.println();
    }

    //********AZALTILMIŞ PARAMETRE LİSTE NESNE*********//
    subeBul = new FindRequest("41.008238", "28.978359,", "1000");
    yakinSube = akbank.getFindBranch(subeBul).getData().getBranchRecords();
    for (FindBranchRecords sube : yakinSube) {
      System.out.println("ATM Var Mı: " + sube.isHasAtm());
      System.out.println("Haftasonları Açık Mı: " + sube.isIsOpenOnWeekend());
      System.out.println("Şube Adı: " + sube.getName());
      System.out.println("Öğle Vakti Açık Mı:" + sube.isIsOpenAtNoon());
      System.out.println("Enlem: " + sube.getLatitude());
      System.out.println("Boylam: " + sube.getLongitude());
      System.out.println("Telefon NUmarası: " + sube.getPhoneNumber());
      System.out.println("Güvenli Kasaya Sahip Mi: " + sube.isHasSafeBox());
      System.out.println();
    }

  }

}
