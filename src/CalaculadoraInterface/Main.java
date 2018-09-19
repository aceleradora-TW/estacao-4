package CalaculadoraInterface;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calc= new Calculadora();


/*        double a,b;

        Scanner scanner= new Scanner();

         scanner.hasNextDouble();*/


        System.out.println("soma "+calc.soma(1,1));
        System.out.println("subtracao "+calc.subtracao(1,1));
        System.out.println("divicao "+calc.divicao(6,4));
        System.out.println("potencia "+calc.potencia(6,4));
        System.out.println("raiz "+calc.raiz(6,4));

    }
}

