package javakamp3Katmanlimimari.bussiness;

import javakamp3Katmanlimimari.dataAccess.IProductDao;
import javakamp3Katmanlimimari.dataAccess.JdbcProductDao;
import javakamp3Katmanlimimari.entities.ProductKatmanli;

public class ProductKatmanliManager {
    IProductDao productDao;

    public ProductKatmanliManager(IProductDao productDao) {
        this.productDao = productDao;
        //Loose Coupuling
    }

    public void add (ProductKatmanli productKatmanli) throws Exception {
        // iş kuralları buraya yazılır...
        if(productKatmanli.getUnitPrice()<10) {
            throw new Exception("sistemde min 10 liralık ürün olabilir");
            //throw yazınca üste ekleme yaptık. bu kullanılırsa
            //hata alabilirsin diye
        }
        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(productKatmanli);
    }
}
