package strategy;

public class ImpostoRJ implements StrategyImposto {
    @Override
    public double calcularImposto(double valor) {
        System.out.println("Imposto RJ");
        return valor * 0.09;
    }
}
