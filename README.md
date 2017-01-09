# Akbank4J
===================
Akbank4J for Akbank Api
![enter image description here](http://akbank4j.org/akbank4j.jpg)
Akbank4J ile Akbank API tarafından verilen hizmetleri kullanabilirsiniz.

https://apiportal.akbank.com/ üye olun ve api key elde edin.
[akbank4j-core.jar](http://akbank4j.org/akbank4j-core.jar) ve [akbank4j-core-javadoc.jar](http://akbank4j.org/akbank4j-core-javadoc.jar) dosyalarını indirin. Projenizin resources dosyasının içine kopyalayın. projenizin pom.xml dosyasına aşağıda ki kodu ekleyin.

#### pom.xml

    <repositories>
        <repository>
            <id>resources</id>
            <url>file://${project.basedir}/src/main/resources</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>org.akbank4j</groupId>
            <artifactId>akbank4j-core</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>


----------

Akbank API Hizmetleri
-------------
 - **CreditApp**: Akbank kredisini kullanmanıza izin verir.
 - **CreditCardApp**: Akbank kredi kartı başvurusunda bulunmanıza izin verir.
 - **CreditInterestRate**: Kredi Faiz Oranları API size güncel faiz oranlarını almanızı sağlar.
 - **CreditPaymentPlan**: Kredi ödeme planını almanızı sağlar.
 - **ExchangeRates**: Size güncel ve geçmiş döviz kurları edinmenize izin verir.
 - **FindATM**: Belirtilen arama alanında ATM bulmanızı sağlar.
 - **FindBranch**: Belirtilen arama alanında yakın şube bulmanızı sağlar.
 - **FindPrices**: Mevcut fon değerleri almak için izin verir.
 - **StockValues**: Mevcut hisse senedi değerleri almak için izin verir.


Konfigurasyon
-------------
    Configuration conf = new Configuration("your_api_key_name", "your_api_key");
    IAkbank akbank = new Akbank(conf);


> **Not:**

> - Akbank API tarafından hize verilen API'nin name ve key bilgilerini yukarıda yazmalısınız.


#### Örnekler

    Akbank4J <CreditPaymentPlanModel> creditPaymentPlan = akbank.getCreditPaymentPlan("0.1234", "1.25", "0.1034", "2015-11-10", "2015-11-10", "5000", "10", "36");
    System.out.println(creditPaymentPlan.getData().getPaymentPlanList().get(0).getDate());


Bu çalışma açık kaynak kodlu olup tüm geliştiricilere açıktır. Akbank'ın Java programlama dili için sunduğu resmi uygulama değildir.
