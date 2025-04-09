package DSOLID.Exemplo1;

public class OracleConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectado ao Oracle.");
    }
}
