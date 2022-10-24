package javakamp3Katmanlimimari.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("dosyaya loglandı kardeş");
    }
}
