package LSOLID.Exemplo2;

public class ContaBancariaCorrigido {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

}
