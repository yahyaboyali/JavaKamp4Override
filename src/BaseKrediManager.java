public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar * 1.18;
    }
    public final double hesapla2(double tutar) {
        return tutar *1.20;
        //bu override edilip ezilemez final bu işe
        //yarar
    }
}
