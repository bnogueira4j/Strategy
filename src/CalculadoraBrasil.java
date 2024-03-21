import strategy.ImpostoMG;
import strategy.ImpostoRJ;
import strategy.ImpostoSP;
import strategy.StrategyImposto;

public class CalculadoraBrasil {

    public static void main (String[] args){
        StrategyImposto imposto = new ImpostoRJ();
        // posso usar qualquer um dos imposto como nas linhas comentadas abaixo
//        imposto = new ImpostoSP();
//        imposto = new ImpostoMG();

       ImpostoPorEstado impostoPorEstado = new ImpostoPorEstado(imposto);
       impostoPorEstado.calcularPorEstado(10);
    }
}

