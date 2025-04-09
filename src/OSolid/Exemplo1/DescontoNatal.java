package OSolid.Exemplo1;

public class DescontoNatal implements CalcularDescontoStrategy{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.9;
    }
}
