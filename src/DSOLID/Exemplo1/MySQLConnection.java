package DSOLID.Exemplo1;

public class MySQLConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Conectado ao MySQL.");
    }
}


