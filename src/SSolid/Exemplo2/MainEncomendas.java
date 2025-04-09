package SSolid.Exemplo2;

import java.util.Scanner;

public class MainEncomendas {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o ID da encomenda: ");
            String idEncomenda = sc.nextLine();

            System.out.println("Digite o peso (em kg): ");
            double peso = sc.nextDouble();

            double valorFrete = new ProcessarEncomendaService().calcularFrete(peso);
            System.out.println("Valor do frete calculado: " + valorFrete);

            new ArquivoService().salvarEmArquivo(idEncomenda, valorFrete);
            System.out.println("Encomenda salva com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
