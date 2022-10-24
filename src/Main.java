import abstracts.GameCalculator;
import abstracts.WomanGameCalculator;
import db.CustomerManager;
import db.OracleDbManager;
import innerClass.DatabaseHelper;
import interfaces.CustomerManagerwithInterfaces;
import interfaces.ICustomerDal;
import interfaces.MySqlDao;
import interfaces.OracleDao;
import javakamp3Katmanlimimari.bussiness.ProductKatmanliManager;
import javakamp3Katmanlimimari.core.logging.DbLogger;
import javakamp3Katmanlimimari.core.logging.Logger;
import javakamp3Katmanlimimari.core.logging.MailLogger;
import javakamp3Katmanlimimari.dataAccess.JdbcProductDao;
import javakamp3Katmanlimimari.entities.ProductKatmanli;
import statik.ProductManagerStatic;
import statik.ProductStatic;
import statik.ProductValidator;
import sun.rmi.runtime.Log;
import youtubeEgitimOOP.CreditManager;
import youtubeEgitimOOP.CustomerYoutube;
import youtubeEgitimOOP.CustomerYoutubeManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
      /* BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager()
                ,new OgrenciKrediManager()};
        for (BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
        //abstract sınıflar asla new yapılamaz base gizlenir bu sayede
        GameCalculator calculator = new WomanGameCalculator();
        calculator.hesapla();
        //sistem oracle veya sql e göre keyfi çalışabilir
        CustomerManager customerManager = new CustomerManager();
        customerManager.dbManager = new OracleDbManager();
        customerManager.getCustomers();
        // interface kullanım
        ICustomerDal customerDal = new OracleDao();
        customerDal.add();
        //interface devam bağımlı hale geldi değer vermeden çalışmaz
        // ama bir şeye değil
       CustomerManagerwithInterfaces cmwI = new CustomerManagerwithInterfaces(new MySqlDao());
        cmwI.add();
        //STATİK YAPILAR
        //statik olarak 1 kere oluşuyor
        // tüm kullanıcılar ortak kullanır
        // uygulama durana kadar bellekten atılmıyor bu statik
        // data taşınsa diğer kullanıcılara da o data geçiyor
        // kullan bırak araçlar statik kullanılabliyor
        ProductManagerStatic pm = new ProductManagerStatic();
        ProductStatic ps = new ProductStatic();
        ps.id = 1;
        ps.price = 10.0;
        ps.name = "tablet";
        pm.add(ps);
        //inner class yapısı
        //best practice önermiyor
        //bir method 1 iş yapacak yani
        // çok kullanılmıyor
        ProductValidator.BaskaClass.bos();
        DatabaseHelper.Crud.delete();
        DatabaseHelper.Crud.Connection.createConnection();*/
      /*
        CreditManager cm = new CreditManager();
        cm.calculate();
        CustomerYoutube cmy = new CustomerYoutube();
        cmy.setFirstName("deneme");
        CustomerYoutubeManager cym = new CustomerYoutubeManager(cmy);
        cym.add();
        System.out.println("" +
                "interfaceler iş yapan sınıfların " +
                "operasyonlarını imza seviyesinde " +
                "yazılarak bağımlılığı sağlayan yapı");
       */
      // katmanlı mimari geçiş
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DbLogger());
        loggers.add(new MailLogger());
        ProductKatmanli productKatmanli
                = new ProductKatmanli(1,"iphone",10);
        ProductKatmanliManager productKatmanliManager =
                new ProductKatmanliManager(new JdbcProductDao(),loggers);
        productKatmanliManager.add(productKatmanli);


    }
}