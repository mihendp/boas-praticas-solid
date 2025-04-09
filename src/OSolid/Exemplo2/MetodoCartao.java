package OSolid.Exemplo2;

public class MetodoCartao implements PagamentoStrategy {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }
}
