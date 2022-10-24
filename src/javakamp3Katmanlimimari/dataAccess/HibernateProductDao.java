package javakamp3Katmanlimimari.dataAccess;

import javakamp3Katmanlimimari.entities.ProductKatmanli;

public class HibernateProductDao implements IProductDao{
    public void add(ProductKatmanli productKatmanli) {
        //sadece db erişim kodları yazılırr!
        System.out.println("hibernate ile db ye eklendi");
    }
}
