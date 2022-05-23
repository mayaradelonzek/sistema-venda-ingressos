import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CalculoValorIngressoStrategy pistaStrategyRegras = new PistaStrategy();
        CalculoValorIngressoStrategy pistaPremiumStrategy = new PistaPremiumStrategy();
        CalculoValorIngressoStrategy camaroteStrategy = new CamaroteStrategy();
        CalculoValorIngressoStrategy cadeiraInferiorStrategy = new CadeiraInferiorStrategy();
        CalculoValorIngressoStrategy cadeiraSuperiorStrategy = new CadeiraSuperiorStrategy();

        Cliente clienteEstudante = new Cliente(LocalDate.of(1990,2,12), true);
        Cliente clienteIdoso = new Cliente(LocalDate.of(1940,2,12), false);
        Cliente clienteNaoEstudanteNaoIdoso = new Cliente(LocalDate.of(1990,2,12), false);
        Cliente clienteEstudanteEIdoso = new Cliente(LocalDate.of(1940,2,12), true);

        System.out.println("PISTA");
        System.out.println(pistaStrategyRegras.calcularValorIngresso(clienteEstudante)); //125
        System.out.println(pistaStrategyRegras.calcularValorIngresso(clienteIdoso)); //125
        System.out.println(pistaStrategyRegras.calcularValorIngresso(clienteNaoEstudanteNaoIdoso)); //250
        System.out.println(pistaStrategyRegras.calcularValorIngresso(clienteEstudanteEIdoso)); //125

        System.out.println("PISTA PREMIUM");
        System.out.println(pistaPremiumStrategy.calcularValorIngresso(clienteEstudante)); //200
        System.out.println(pistaPremiumStrategy.calcularValorIngresso(clienteIdoso)); //200
        System.out.println(pistaPremiumStrategy.calcularValorIngresso(clienteNaoEstudanteNaoIdoso)); //400
        System.out.println(pistaPremiumStrategy.calcularValorIngresso(clienteEstudanteEIdoso)); //200

        System.out.println("CAMAROTE");
        System.out.println(camaroteStrategy.calcularValorIngresso(clienteEstudante)); //750
        System.out.println(camaroteStrategy.calcularValorIngresso(clienteIdoso)); //750
        System.out.println(camaroteStrategy.calcularValorIngresso(clienteNaoEstudanteNaoIdoso)); //750
        System.out.println(camaroteStrategy.calcularValorIngresso(clienteEstudanteEIdoso)); //750

        System.out.println("CADEIRA INF");
        System.out.println(cadeiraInferiorStrategy.calcularValorIngresso(clienteEstudante)); //100
        System.out.println(cadeiraInferiorStrategy.calcularValorIngresso(clienteIdoso)); //80
        System.out.println(cadeiraInferiorStrategy.calcularValorIngresso(clienteNaoEstudanteNaoIdoso)); //200
        System.out.println(cadeiraInferiorStrategy.calcularValorIngresso(clienteEstudanteEIdoso)); //80 ----

        System.out.println("CADEIRA SUP");
        System.out.println(cadeiraSuperiorStrategy.calcularValorIngresso(clienteEstudante)); //75
        System.out.println(cadeiraSuperiorStrategy.calcularValorIngresso(clienteIdoso)); //60
        System.out.println(cadeiraSuperiorStrategy.calcularValorIngresso(clienteNaoEstudanteNaoIdoso)); //150
        System.out.println(cadeiraSuperiorStrategy.calcularValorIngresso(clienteEstudanteEIdoso)); //60 ----


    }
}
