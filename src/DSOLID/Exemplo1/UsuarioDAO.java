package DSOLID.Exemplo1;


public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection; // Dependência direta
    }

    public void salvarUsuario(String nome) {
        connection.connect();
        System.out.println("Salvando usuário: " + nome);
    }
}
