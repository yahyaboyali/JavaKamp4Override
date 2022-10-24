package javakamp3Katmanlimimari.bussiness;

import javakamp3Katmanlimimari.core.logging.Logger;
import javakamp3Katmanlimimari.dataAccess.IProductDao;
import javakamp3Katmanlimimari.dataAccess.JdbcProductDao;
import javakamp3Katmanlimimari.entities.ProductKatmanli;

import java.util.List;

public class ProductKatmanliManager {
    private IProductDao productDao;
    private List<Logger> loggers;
    public ProductKatmanliManager(IProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
        //Loose Coupuling
    }

    public void add (ProductKatmanli productKatmanli) throws Exception {
        // iş kuralları buraya yazılır...
        if(productKatmanli.getUnitPrice()<10) {
            throw new Exception("sistemde min 10 liralık ürün olabilir");
            //throw yazınca üste ekleme yaptık. bu kullanılırsa
            //hata alabilirsin diye
        }
        productDao.add(productKatmanli);
        for (Logger logger: loggers) {
            logger.log(productKatmanli.getName());
        }
    }
}
