package statik;

public class ProductManagerStatic {
    public void add(ProductStatic product) {
        // burada new Productvalidator demedik statik
        // anahtar sözcüğü kullandık bu sayede gerekmedi
        if(ProductValidator.isValid(product)){
            System.out.println("eklendi");
        }else {
            System.out.println("eklenemedi");
        }
    }
}
