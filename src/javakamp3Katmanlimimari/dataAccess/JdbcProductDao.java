package javakamp3Katmanlimimari.dataAccess;

import javakamp3Katmanlimimari.entities.ProductKatmanli;

public class JdbcProductDao implements IProductDao{
    //dao data access object
    public void add(ProductKatmanli productKatmanli) {
        //sadece db erişim kodları yazılırr!
        System.out.println("jdbc ile db ye eklendi");
    }
}
