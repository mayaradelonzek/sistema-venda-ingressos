import java.math.BigDecimal;

public class PistaPremiumStrategy implements CalculoValorIngressoStrategy {
    BigDecimal valorIngresso = new BigDecimal(400.00);

    @Override
    public BigDecimal calcularValorIngresso(Cliente cliente) {

        BigDecimal valorIngressoComDesconto = valorIngresso;

        if (cliente.getEstudante() || cliente.isIdoso()) {
            valorIngressoComDesconto =  this.valorIngresso.multiply(BigDecimal.valueOf(0.5));
        }

        return valorIngressoComDesconto;
    }
}
