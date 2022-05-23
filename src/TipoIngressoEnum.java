public enum TipoIngressoEnum {
    PISTA(new PistaStrategy()),
    PISTA_PREMIUM(new PistaStrategy()),
    CAMAROTE(new CamaroteStrategy()),
    CADEIRA_INFERIOR(new CadeiraInferiorStrategy()),
    CADEIRA_SUPERIOR(new CadeiraSuperiorStrategy());

    private TipoIngressoEnum(CalculoValorIngressoStrategy strategy) {
        this.strategy = strategy;
    }

    private final CalculoValorIngressoStrategy strategy;

    public CalculoValorIngressoStrategy getStrategy() {
        return strategy;
    }
}
