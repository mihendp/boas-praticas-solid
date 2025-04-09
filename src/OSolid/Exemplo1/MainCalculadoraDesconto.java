package OSolid.Exemplo1;

public class MainCalculadoraDesconto {
    public static void main(String[] args) {
        DescontoFactory descontoFactory = new DescontoFactory();
        double valor = 10;

        descontoFactory.getDescontoStrategy(TipoDesconto.NATAL).ifPresentOrElse(descontoStrategy -> {
                double valorComDesconto = descontoStrategy.calcularDesconto(valor);
                System.out.println("Valor com valorComDesconto de Natal: " + valorComDesconto);
        }, () -> {
            System.err.println("Atualmente não possuímos essa forma de desconto.");
        });

        descontoFactory.getDescontoStrategy(TipoDesconto.ANIVERSARIO).ifPresentOrElse(descontoStrategy -> {
            double valorComDesconto = descontoStrategy.calcularDesconto(valor);
            System.out.println("Valor com desconto de Aniversário: " + valorComDesconto);
        }, () -> {
            System.err.println("Atualmente não possuímos essa forma de desconto.");
        });

    }
}
