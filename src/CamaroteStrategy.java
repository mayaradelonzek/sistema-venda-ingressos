import java.math.BigDecimal;

public class CamaroteStrategy implements CalculoValorIngressoStrategy{
    BigDecimal valorIngresso = BigDecimal.valueOf(750.00);

    @Override
    public BigDecimal calcularValorIngresso(Cliente cliente) {

        return this.valorIngresso;
    }
}
