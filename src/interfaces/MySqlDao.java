package interfaces;

public class MySqlDao implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("mysql eklendi");
    }
}
