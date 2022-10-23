package innerClass;

public class DatabaseHelper {
    public static class Crud{
        public static void delete(){
            System.out.println("sil");
        }
        public static void update(){
            System.out.println("güncelle");
        }
        public static class Connection {
            public static void createConnection() {
                System.out.println("bağlantı kur");
            }
        }
    }
}
