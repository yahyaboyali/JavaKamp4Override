package cokluimplementasyon;
//bizim elemanlar
public class Worker implements Iworkable,IEatable,IPayable {
    @Override
    public void work() {

    }

    @Override
    public void eat() {
       //bizim elemanlara yemek veriyoruz obaya yemek yok

    }

    @Override
    public void paid() {
    //Maaşı tek kendi firmamıza veriyoz
    }
}
