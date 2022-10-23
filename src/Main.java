import abstracts.GameCalculator;
import abstracts.WomanGameCalculator;

public class Main {
    public static void main(String[] args) {
      /*  BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager()
                ,new OgrenciKrediManager()};
        for (BaseKrediManager krediManager: krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }*/
        //abstract sınıflar asla new yapılamaz base gizlenir bu sayede
        GameCalculator calculator = new WomanGameCalculator();
        calculator.hesapla();
    }
}