import abstracts.GameCalculator;
import abstracts.WomanGameCalculator;
import db.CustomerManager;
import db.OracleDbManager;

public class Main {
    public static void main(String[] args) {
      /*  BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager()
                ,new OgrenciKrediManager()};
        for (BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }*/
        //abstract sınıflar asla new yapılamaz base gizlenir bu sayede
       /* GameCalculator calculator = new WomanGameCalculator();
        calculator.hesapla();*/
        //sistem oracle veya sql e göre keyfi çalışabilir
        CustomerManager customerManager = new CustomerManager();
        customerManager.dbManager = new OracleDbManager();
        customerManager.getCustomers();

    }
}