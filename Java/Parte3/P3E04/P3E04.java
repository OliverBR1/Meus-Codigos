package P3.P3E04;
import java.util.Scanner;
/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class P3E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para x: ");
        Double valor = sc.nextDouble();
        Cosseno c = new Cosseno(valor);
        System.out.println("Cosseno: " + Math.cos(valor));

        sc.close();
    }
}
