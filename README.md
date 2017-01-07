# Akbank4J
===================
Akbank4J for Akbank Api

Akbank4J ile Akbank API tarafından verilen hizmetleri kullanabilirsiniz.

https://apiportal.akbank.com/ üye olun ve api key elde edin.

----------

Akbank API Hizmetleri
-------------
- Kredi Kartı Uygulama Hizmeti
- Kredi Faiz Oranları
- Kredi Ödeme Planı
- Kredi Uygulama Hizmeti
- Exchange Oranları Servisi
- ATM Hizmetini Bulma
- Şube Hizmetini Bulma
- Font Fiyatlar Servisi
- Menkul Değerler


Konfigurasyon
-------------
Configuration conf = new Configuration("your_api_key_name", "your_api_key");

IAkbank akbank = new Akbank(conf);


> **Not:**

> - Akbankk API tarafından hize verilen API'nin name ve key bilgilerini yukarıda yazmalısınız.


#### Örnekler

Akbank4J < CreditPaymentPlanModel> creditPaymentPlan = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");

System.out.println(creditPaymentPlan.getData().getPaymentPlanList().get(0).getDate());
