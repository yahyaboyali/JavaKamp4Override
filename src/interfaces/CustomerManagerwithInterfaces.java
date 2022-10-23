package interfaces;

public class CustomerManagerwithInterfaces {
    private ICustomerDal customerDal;

    public CustomerManagerwithInterfaces(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add() {customerDal.add();}
}
