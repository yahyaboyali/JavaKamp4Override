package javakamp3Katmanlimimari.core.logging;

public class DbLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("db ile loglandı");
    }
}
