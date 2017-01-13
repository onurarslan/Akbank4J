/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.akbank4j.example;

import org.akbank4j.core.Akbank;
import org.akbank4j.core.api.IAkbank;
import org.akbank4j.core.conf.Configuration;
import org.akbank4j.core.models.CreditApplicationServiceModel;

/**
 * Akbank Kredi başvurusu yapmanızız sağlar.
 *
 * @author Onur Arslan
 */
public class KrediBasvurusu {

  public static void main(String[] args) {
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = new Akbank(conf);

    CreditApplicationServiceModel krediBasvurusu = akbank.getCreditApp("05321234567", "12345678901").getData();
    System.out.println("SMS Kredi Referans No: " + krediBasvurusu.getSmsCreditRefNo());
  }

}
