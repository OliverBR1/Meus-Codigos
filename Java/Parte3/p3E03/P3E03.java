package P3.p3E03;

import java.util.Scanner;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class P3E03 {

	public static Scanner ze = new Scanner(System.in);

	public static void main(String[] args) {
		Aluno[] classe = new Aluno[4];

		for (int i = 0; i < 4; i++) {
			classe[i] = getAluno();
			System.out.println("Media das Notas = " + classe[i].media());
		}

		System.out.println("Media da classe = " + mediaClasse(classe));
	}

	public static double mediaClasse(Aluno[] c) {
		double soma = 0;
		for (Aluno a : c)
			soma += a.media();
		return soma / c.length;
	}

	public static Aluno getAluno() {
		System.out.println("Informe os dados do P3.p3E03.P3E03.Aluno");
		System.out.print("Matricula...: ");
		int matricula = Integer.parseInt(ze.nextLine());
		System.out.print("Nome........: ");
		String nome = ze.nextLine();
		System.out.print("Qtde Notas..: ");
		int qtde = Integer.parseInt(ze.nextLine());
		double[] notas = new double[qtde];
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Notas [" + (i + 1) + "]...: ");
			notas[i] = Double.parseDouble(ze.nextLine());
		}
		Aluno a = new Aluno(matricula, nome, notas);
		return a;
	}
}