package OSolid.Exemplo2;


import java.util.Scanner;

public class MainSistemaPagamento {
    public static void main(String[] args) {
        MetodoPagamentoFactory metodoPagamentoFactory = new MetodoPagamentoFactory();

        try(Scanner scanner = new Scanner(System.in)) {
            for (MetodoPagamento metodoPagamento : MetodoPagamento.values()) {
                System.out.println("\n");
                PagamentoStrategy pagamentoStrategy = metodoPagamentoFactory.getPagamentoStrategy(metodoPagamento);
                System.out.println("Digite o valor do pagamento: ");
                double valor = Double.parseDouble(scanner.next());

                pagamentoStrategy.realizarPagamento(valor);

            }
        }



    }
}
