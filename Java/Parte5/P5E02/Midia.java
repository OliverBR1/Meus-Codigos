package P5E02;

import java.util.Scanner;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public abstract class Midia {
    protected int codigo;
    protected double preco;
    protected String nome;

    public Midia() {}

    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public abstract String getTipo();

    public String getDetalhes() {
        return "codigo: " + codigo +"\n"
                + "preco: " + preco +"\n"
                + "nome: " + nome +"\n";
    }


    public void printDados() {
        System.out.println(getTipo() + "\n" + getDetalhes() +
                "\n--------------------------------------------");
    }

    public void inserirDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadastro de mídia:" + getTipo());
        System.out.print("Digite o código: ");
        codigo = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o preço: ");
        preco = Double.parseDouble(sc.nextLine());
        System.out.print("Digite o nome: ");
        nome = sc.nextLine();
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
