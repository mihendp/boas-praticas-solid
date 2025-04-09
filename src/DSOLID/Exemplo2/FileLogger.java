package DSOLID.Exemplo2;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log: " + message + "\n gravado em arquivo com sucesso.");
    }
}
