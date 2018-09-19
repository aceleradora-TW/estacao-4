package CalaculadoraInterface;

import java.util.Random;

public class Calculadora implements OperacaoInterface {

    @Override
    public int soma(int a, int b) {
        return a+b;
    }

    @Override
    public int subtracao(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplica(int a, int b) {
        return a*b;
    }

    @Override
    public int divicao(int a, int b) {
        int div = a/b;
        //int ret = a%b;

        return div;

    }

    @Override
    public double potencia(double a, double b) {

        return  Math.pow(a,b);

    }

    @Override
    public double raiz(double a, double b) {

        return  Math.pow(a,(1/b));

    }
    /*public int random(){
       int
        return
    }*/


}
