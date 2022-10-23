package statik;

public class ProductValidator { //ana class static olamaz

    public ProductValidator() {
        System.out.println("bu kısım çalışmaz");
    }
    //çalışmasını istiyorsak static bloğuna almamız lazım
    static {
        System.out.println("bu kısım bu static block içinde ise new" +
                "yapılmaksızın çalışır");
    }
    public static boolean isValid(ProductStatic product) {

        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }
        return false;
    }
    //inner class yapısı
    //burada iç class a static verilebiliyor
    /*
    * yoksa içeriye static fonskiyon verilemiyor
    * */
    public static class BaskaClass {
        public static void bos() {
            System.out.println("boş");
        }
    }
}