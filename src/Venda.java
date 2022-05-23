import java.math.BigDecimal;

public class Venda {

    private Cliente cliente;
    private TipoIngressoEnum tipoIngressoEnum;
    private BigDecimal valorIngresso;

    public Venda(Cliente cliente, TipoIngressoEnum tipoIngressoEnum) {
        this.cliente = cliente;
        this.tipoIngressoEnum = tipoIngressoEnum;
        calcular();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoIngressoEnum getTipoIngressoEnum() {
        return tipoIngressoEnum;
    }

    public BigDecimal getValorIngresso() {
        return valorIngresso;
    }

    private void calcular() {
        this.valorIngresso = this.tipoIngressoEnum.getStrategy().calcularValorIngresso(this.cliente);
    }
}
