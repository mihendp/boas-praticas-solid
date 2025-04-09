package OSolid.Exemplo2;

public class MetodoPix implements PagamentoStrategy{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}
