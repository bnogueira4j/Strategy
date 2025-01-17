import strategy.ImpostoSP;
import strategy.StrategyImposto;

public class ImpostoPorEstado {
    private final StrategyImposto imposto;
    public ImpostoPorEstado(StrategyImposto imposto) {
        this.imposto = imposto;
    }
    public void calcularPorEstado(double valor) {
        double valorCalculado = imposto.calcularImposto(valor);
        System.out.println(valorCalculado);
    }
}
