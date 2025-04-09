package OSolid.Exemplo1;

public class DescontoAniversario implements CalcularDescontoStrategy{
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.8;
    }
}
