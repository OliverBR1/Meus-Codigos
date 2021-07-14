package P3.P3PRF;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

import java.util.Scanner;

public class P3PRF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de dados para calcular: ");
        int qtdDados = Integer.parseInt(entrada.next());
        Double[] listaCalc = new Double[qtdDados];

        for(int i = 0; i < listaCalc.length; i++) {
            System.out.println("Informe o dado " + (i + 1) + ": ");
            listaCalc [i] = Double.parseDouble(entrada.next());
        }

        Estatistica e = new Estatistica(listaCalc);

        System.out.println("Valores na ordem em que foram digitados:");
        e.imprimirValores();
        System.out.println("=========================================");
        System.out.println("Valores em ordem crescente: ");
        e.ordena();
        e.imprimirValores();
        System.out.println("=========================================");
        System.out.println("A média dos valores é: " + e.getMedia());
        System.out.println("=========================================");
        System.out.println("A moda da série é: " + e.getModa());
        System.out.println("=========================================");
        e.getMediana();
        System.out.println("=========================================");
        System.out.println("Variância: " + e.getVariancia());
        System.out.println("=========================================");
        System.out.println("Desvio-padrão: " + e.getDesvioPadrao());

        entrada.close();
    }
}
