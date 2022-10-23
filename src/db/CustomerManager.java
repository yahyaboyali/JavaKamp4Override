package db;

public class CustomerManager {
    public BaseDatabaseManager dbManager ;
    public void getCustomers() {
        dbManager.getData();
    }
}
