package P5E02;

import java.util.Scanner;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class DVD extends Midia{
    protected int nFaixas;
    public DVD(int codigo, double preco, String nome,int nFaixas) {
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;
    }
    public DVD() {}

    public String getTipo() {
        return DVD.class.getSimpleName();
    }

    public String getDetalhes() {
        return super.getDetalhes() + "número de faixas: " + nFaixas;
    }

    @Override
    public void printDados() {
        super.printDados();
    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        super.inserirDados();
        System.out.print("Digite o número de faixas: ");
        nFaixas = Integer.parseInt(sc.nextLine());
        System.out.println("--------------------------------------------");
        DVD dvd = new DVD(codigo, preco, nome, nFaixas);
    }
}
