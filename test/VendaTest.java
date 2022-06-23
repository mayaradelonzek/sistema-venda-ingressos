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

    private Venda vendaPistaEstudante;
    private Venda vendaPistaIdoso;
    private Venda vendaPistaNormal;
    private Venda vendaPistaEstudanteIdoso;

    private Venda vendaPistaPremiumEstudante;
    private Venda vendaPistaPremiumIdoso;
    private Venda vendaPistaPremiumNormal;
    private Venda vendaPistaPremiumEstudanteIdoso;

    private Venda vendaCamaroteEstudante;
    private Venda vendaCamaroteIdoso;
    private Venda vendaCamaroteNormal;
    private Venda vendaCamaroteEstudanteIdoso;

    private Venda vendaCadeiraInfEstudante;
    private Venda vendaCadeiraInfIdoso;
    private Venda vendaCadeiraInfNormal;
    private Venda vendaCadeiraInfEstudanteIdoso;

    private Venda vendaCadeiraSupEstudante;
    private Venda vendaCadeiraSupIdoso;
    private Venda vendaCadeiraSupNormal;
    private Venda vendaCadeiraSupEstudanteIdoso;

    private TipoIngressoEnum tipoIngressoEnum;

    @Before
    public void init() {
        this.clienteEstudante = new Cliente(LocalDate.of(2010,11,22), true);
        this.clienteIdoso = new Cliente(LocalDate.of(1962,05,22), false);
        this.clienteNaoEstudanteENaoIdoso = new Cliente(LocalDate.of(1980,05,22), false);
        this.clienteEstudanteEIdoso = new Cliente(LocalDate.of(1940,2,12), true);

        this.vendaPistaEstudante = new Venda(clienteEstudante, tipoIngressoEnum.PISTA);
        this.vendaPistaIdoso = new Venda(clienteIdoso, tipoIngressoEnum.PISTA);
        this.vendaPistaNormal = new Venda(clienteNaoEstudanteENaoIdoso, tipoIngressoEnum.PISTA);
        this.vendaPistaEstudanteIdoso = new Venda(clienteEstudanteEIdoso, tipoIngressoEnum.PISTA);

        this.vendaPistaPremiumEstudante = new Venda(clienteEstudante, tipoIngressoEnum.PISTA_PREMIUM);
        this.vendaPistaPremiumIdoso = new Venda(clienteIdoso, tipoIngressoEnum.PISTA_PREMIUM);
        this.vendaPistaPremiumNormal = new Venda(clienteNaoEstudanteENaoIdoso, tipoIngressoEnum.PISTA_PREMIUM);
        this.vendaPistaPremiumEstudanteIdoso = new Venda(clienteEstudanteEIdoso, tipoIngressoEnum.PISTA_PREMIUM);

        this.vendaCamaroteEstudante = new Venda(clienteEstudante, tipoIngressoEnum.CAMAROTE);
        this.vendaCamaroteIdoso = new Venda(clienteIdoso, tipoIngressoEnum.CAMAROTE);
        this.vendaCamaroteNormal = new Venda(clienteNaoEstudanteENaoIdoso, tipoIngressoEnum.CAMAROTE);
        this.vendaCamaroteEstudanteIdoso = new Venda(clienteEstudanteEIdoso, tipoIngressoEnum.CAMAROTE);

        this.vendaCadeiraInfEstudante = new Venda(clienteEstudante, tipoIngressoEnum.CADEIRA_INFERIOR);
        this.vendaCadeiraInfIdoso = new Venda(clienteIdoso, tipoIngressoEnum.CADEIRA_INFERIOR);
        this.vendaCadeiraInfNormal = new Venda(clienteNaoEstudanteENaoIdoso, tipoIngressoEnum.CADEIRA_INFERIOR);
        this.vendaCadeiraInfEstudanteIdoso = new Venda(clienteEstudanteEIdoso, tipoIngressoEnum.CADEIRA_INFERIOR);

        this.vendaCadeiraSupEstudante = new Venda(clienteEstudante, tipoIngressoEnum.CADEIRA_SUPERIOR);
        this.vendaCadeiraSupIdoso = new Venda(clienteIdoso, tipoIngressoEnum.CADEIRA_SUPERIOR);
        this.vendaCadeiraSupNormal = new Venda(clienteNaoEstudanteENaoIdoso, tipoIngressoEnum.CADEIRA_SUPERIOR);
        this.vendaCadeiraSupEstudanteIdoso = new Venda(clienteEstudanteEIdoso, tipoIngressoEnum.CADEIRA_SUPERIOR);
    }

    @Test
    public void deveCriarUmaVendaPistaParaEstudante() {
        Assert.assertEquals(vendaPistaEstudante.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN) ,
                new BigDecimal(125.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaParaIdoso() {
        Assert.assertEquals(vendaPistaIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(125.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaParaNaoIdosoNaoEstudante() {
        Assert.assertEquals(vendaPistaNormal.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(250.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaParaEstudanteIdoso() {
        Assert.assertEquals(vendaPistaEstudanteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(125.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaEstudante() {
        Assert.assertEquals(vendaPistaPremiumEstudante.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaIdoso() {
        Assert.assertEquals(vendaPistaPremiumIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaNaoIdosoNaoEstudante() {
        Assert.assertEquals(vendaPistaPremiumNormal.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(400.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaPistaPremiumParaEstudanteIdoso() {
        Assert.assertEquals(vendaPistaPremiumEstudanteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaEstudante() {
        Assert.assertEquals(vendaCamaroteEstudante.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaIdoso() {
        Assert.assertEquals(vendaCamaroteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaNaoIdosoNaoEstudante() {
        Assert.assertEquals(vendaCamaroteNormal.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCamaroteParaEstudanteIdoso() {
        Assert.assertEquals(vendaCamaroteEstudanteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(750.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaEstudante() {
        Assert.assertEquals(vendaCadeiraInfEstudante.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(100.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaIdoso() {
        Assert.assertEquals(vendaCadeiraInfIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(80.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaNaoIdosoNaoEstudante() {
        Assert.assertEquals(vendaCadeiraInfNormal.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(200.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraInferiorParaEstudanteIdoso() {
        Assert.assertEquals(vendaCadeiraInfEstudanteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(80.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaEstudante() {
        Assert.assertEquals(vendaCadeiraSupEstudante.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(75.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaIdoso() {
        Assert.assertEquals(vendaCadeiraSupIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(60.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaNaoIdosoNaoEstudante() {
        Assert.assertEquals(vendaCadeiraSupNormal.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(150.0).setScale(2, RoundingMode.HALF_EVEN));
    }

    @Test
    public void deveCriarUmaVendaCadeiraSuperiorParaEstudanteIdoso() {
        Assert.assertEquals(vendaCadeiraSupEstudanteIdoso.getValorIngresso().setScale(2, RoundingMode.HALF_EVEN),
                new BigDecimal(60.0).setScale(2, RoundingMode.HALF_EVEN));
    }
}
