import java.math.BigDecimal;

public class CamaroteStrategy implements CalculoValorIngressoStrategy{
    BigDecimal valorIngresso = new BigDecimal(750.00);

    @Override
    public BigDecimal calcularValorIngresso(Cliente cliente) {

        return this.valorIngresso;
    }
}
