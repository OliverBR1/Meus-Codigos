package p5.p5E01;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Calculadora {

    public static void main(String[] args) throws ArithmeticException {

        Contas.mostrarCalculo(new Soma(), 5,5);
        System.out.println("-----------------------------------");
        Contas.mostrarCalculo(new Subtracao(), 67, 32);
        System.out.println("-----------------------------------");
        Contas.mostrarCalculo(new Divisao(), 5, 5);
        System.out.println("-----------------------------------");
        Contas.mostrarCalculo(new Multiplicacao(), 50, 40);
        System.out.println("-----------------------------------");
        Contas.mostrarCalculo(new Resto(), 9, 4);

    }
}
