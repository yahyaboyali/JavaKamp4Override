import abstracts.GameCalculator;
import abstracts.WomanGameCalculator;
import db.CustomerManager;
import db.OracleDbManager;
import interfaces.CustomerManagerwithInterfaces;
import interfaces.ICustomerDal;
import interfaces.MySqlDao;
import interfaces.OracleDao;

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
       /* CustomerManager customerManager = new CustomerManager();
        customerManager.dbManager = new OracleDbManager();
        customerManager.getCustomers();*/
        // interface kullanım
        /*ICustomerDal customerDal = new OracleDao();
        customerDal.add();*/
        //interface devam bağımlı hale geldi değer vermeden çalışmaz
        // ama bir şeye değil
        CustomerManagerwithInterfaces cmwI = new CustomerManagerwithInterfaces(new MySqlDao());
        cmwI.add();

    }
}