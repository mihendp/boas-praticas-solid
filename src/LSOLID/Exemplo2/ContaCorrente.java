package LSOLID.Exemplo2;

public class ContaCorrente extends ContaBancaria implements Saque{
    @Override
    public void sacar(double valor) {
        super.saldo -= valor;
    }
}
