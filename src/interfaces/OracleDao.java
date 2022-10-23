package interfaces;

public class OracleDao implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("oracle add");
    }
}
