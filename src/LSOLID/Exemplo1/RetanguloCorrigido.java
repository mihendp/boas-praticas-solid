package LSOLID.Exemplo1;

public class RetanguloCorrigido extends Quadrilatero{

    private double altura;

    public RetanguloCorrigido(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
