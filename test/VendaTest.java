import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class VendaTest {

    private Cliente clienteEstudante;
    private Cliente clienteIdoso;
    private Cliente clienteNaoEstudanteENaoIdoso;
    private Cliente clienteEstudanteEIdoso;
    private CalculoValorIngressoStrategy pistaStrategy;
    private CalculoValorIngressoStrategy pistaPremiumStrategy;
    private CalculoValorIngressoStrategy camaroteStrategy;
    private CalculoValorIngressoStrategy cadeiraInferiorStrategy;
    private CalculoValorIngressoStrategy cadeiraSuperiorStrategy;

    @Before
    public void init() {
        this.clienteEstudante = new Cliente(LocalDate.of(2010,11,22), true);
        this.clienteIdoso = new Cliente(LocalDate.of(1962,05,22), false);
        this.clienteNaoEstudanteENaoIdoso = new Cliente(LocalDate.of(1980,05,22), false);
        this.clienteEstudanteEIdoso = new Cliente(LocalDate.of(1940,2,12), true);

        this.pistaStrategy = new PistaStrategy();
        this.pistaPremiumStrategy = new PistaPremiumStrategy();
        this.camaroteStrategy = new CamaroteStrategy();
        this.cadeiraInferiorStrategy = new CadeiraInferiorStrategy();
        this.cadeiraSuperiorStrategy = new CadeiraSuperiorStrategy();
    }

    @Test
    public void deveCriarUmaVendaPistaParaEstudante() {

        Assert.assertEquals(pistaStrategy.calcularValorIngresso(clienteEstudante).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(125.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaParaIdoso() {

        Assert.assertEquals(pistaStrategy.calcularValorIngresso(clienteIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(125.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaParaNaoIdosoNaoEstudante() {

        Assert.assertEquals(pistaStrategy.calcularValorIngresso(clienteNaoEstudanteENaoIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(250.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaEstudante() {

        Assert.assertEquals(pistaPremiumStrategy.calcularValorIngresso(clienteEstudante).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaIdoso() {

        Assert.assertEquals(pistaPremiumStrategy.calcularValorIngresso(clienteIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaNaoIdosoNaoEstudante() {

        Assert.assertEquals(pistaPremiumStrategy.calcularValorIngresso(clienteNaoEstudanteENaoIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(400.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaEstudante() {

        Assert.assertEquals(camaroteStrategy.calcularValorIngresso(clienteEstudante).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaIdoso() {

        Assert.assertEquals(camaroteStrategy.calcularValorIngresso(clienteIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaNaoIdosoNaoEstudante() {

        Assert.assertEquals(camaroteStrategy.calcularValorIngresso(clienteNaoEstudanteENaoIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaEstudante() {

        Assert.assertEquals(cadeiraInferiorStrategy.calcularValorIngresso(clienteEstudante).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(100.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaIdoso() {

        Assert.assertEquals(cadeiraInferiorStrategy.calcularValorIngresso(clienteIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(80.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaNaoIdosoNaoEstudante() {

        Assert.assertEquals(cadeiraInferiorStrategy.calcularValorIngresso(clienteNaoEstudanteENaoIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaEstudante() {

        Assert.assertEquals(cadeiraSuperiorStrategy.calcularValorIngresso(clienteEstudante).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(75.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaIdoso() {

        Assert.assertEquals(cadeiraSuperiorStrategy.calcularValorIngresso(clienteIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(60.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaNaoIdosoNaoEstudante() {

        Assert.assertEquals(cadeiraSuperiorStrategy.calcularValorIngresso(clienteNaoEstudanteENaoIdoso).setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(150.0).setScale(2, RoundingMode.HALF_EVEN));
    }
}
