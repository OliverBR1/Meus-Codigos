package P5E02;

import java.util.Scanner;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class CD extends Midia{
    private int nMusicas;

    public CD() {}

    public CD(int codigo, double preco, String nome,int nMusicas) {
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;
    }

    public String getTipo() {
        return CD.class.getSimpleName();
    }
    @Override
    public String getDetalhes() {
        return super.getDetalhes() + "quantidade de músicas: " + nMusicas;
    }
    @Override
    public void printDados() {
      super.printDados();

    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.print("Digite o número de músicas: ");
        nMusicas = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------------------");
        CD cd = new CD(codigo, preco, nome, nMusicas);

    }

}
