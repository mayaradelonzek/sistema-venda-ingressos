import java.math.BigDecimal;

public class CadeiraSuperiorStrategy implements CalculoValorIngressoStrategy {
    BigDecimal valorIngresso = BigDecimal.valueOf(150.00);

    @Override
    public BigDecimal calcularValorIngresso(Cliente cliente) {

        BigDecimal valorIngressoComDesconto = valorIngresso;

        if (cliente.isIdoso()) {
            valorIngressoComDesconto =  this.valorIngresso.multiply(BigDecimal.valueOf(0.4));
        } else if (cliente.getEstudante()) {
            valorIngressoComDesconto =  this.valorIngresso.multiply(BigDecimal.valueOf(0.5));
        }

        return valorIngressoComDesconto;
    }
}
