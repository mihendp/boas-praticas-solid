package OSolid.Exemplo1;

import java.util.Map;
import java.util.Optional;

public class DescontoFactory {

    private final Map<TipoDesconto, CalcularDescontoStrategy> descontoStrategyMap;

    public DescontoFactory() {
        this.descontoStrategyMap = Map.of(
            TipoDesconto.NATAL, new DescontoNatal(),
            TipoDesconto.ANIVERSARIO, new DescontoAniversario()
        );
    }

    public Optional<CalcularDescontoStrategy> getDescontoStrategy(TipoDesconto tipoDesconto) {
        return Optional.ofNullable(descontoStrategyMap.get(tipoDesconto));
    }

}
