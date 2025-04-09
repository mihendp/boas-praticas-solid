package OSolid.Exemplo2;

public class MetodoPagamentoFactory {

    public PagamentoStrategy getPagamentoStrategy(MetodoPagamento metodoPagamento) {
        return switch (metodoPagamento) {
            case PIX: {
                printMetodoPagamento(metodoPagamento);
                yield new MetodoPix();
            }
            case CARTAO: {
                printMetodoPagamento(metodoPagamento);
                yield new MetodoCartao();
            }
            case BOLETO: {
                printMetodoPagamento(metodoPagamento);
                yield new MetodoBoleto();
            }
        };
    }

    private void printMetodoPagamento(MetodoPagamento metodoPagamento) {
        System.out.println("Método de pagamento selecionado: " + metodoPagamento);
    }

}
