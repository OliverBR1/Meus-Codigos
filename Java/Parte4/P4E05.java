package p4;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class P4E05 {
    public static void main(String[] args) {
        testaTipo();

    }
    public static void testaTipo() {
        try {
            System.out.println("Você digitou: " + valueOf(recebeNumero()) + ".");

        } catch (NumberFormatException e) {
            System.out.println("Este não é um inteiro numérico");
            testaTipo();
        }

    }

    public static String recebeNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String num = sc.nextLine();
        return num;
    }
}
