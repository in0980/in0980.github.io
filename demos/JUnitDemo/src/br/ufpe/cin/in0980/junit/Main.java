package br.ufpe.cin.in0980.junit;

public class Main {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println("Hello World!");
        String exp = "1+1";
        System.out.println(exp + " = "+ calc.avaliar(exp) + " = " + calc.somar(1,1));

        //double teste = 10/0;
        //System.out.println(calc.dividir(10.0,0.0));
    }
}
