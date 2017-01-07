# Akbank4J
Akbank4J for Akbank Api

Akbank4J ile Akbank API tarafından verilen hizmetleri kullanabilirsiniz.

https://apiportal.akbank.com/ üye olun ve api key elde edin.

# Örnek
Configuration conf = new Configuration("your_api_key_name", "your_api_key");

IAkbank akbank = new Akbank(conf);

Akbank4J<CreditPaymentPlanModel> creditPaymentPlan = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");

System.out.println(creditPaymentPlan.getData().getPaymentPlanList().get(0).getDate());

# Hizmetler
- Kredi Kartı Uygulama Hizmeti
- Kredi Faiz Oranları
- Kredi Ödeme Planı
- Kredi Uygulama Hizmeti
- Exchange Oranları Servisi
- BMM Hizmetini Bulma
- Şube Hizmetini Bulma
- Fond Fiyatlar Servisi
- Menkul Değerler
