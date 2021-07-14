package Pesquisa;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestaPesquisa {
	
	public static Scanner ze = new Scanner (System.in);
	public static Random ml = new Random(new Date().getTime());
	

	public static void main(String[] args) {
        System.out.println("Pesquisa de Produto");
        System.out.print("Pessoas Pesquisadas.....: ");
		int qtdPessoas = Integer.parseInt(ze.nextLine());
        System.out.print("1(Automática)/2(Manual).: ");
		int tipo = Integer.parseInt(ze.nextLine());
		Pesquisa [] p = new Pesquisa[qtdPessoas];
		fazPesquisa(p,tipo);
		imprimeResultado(p);
        System.out.println("Fim da Pesquisa");
	}
	
	public static void imprimeResultado(Pesquisa[] p) {
		System.out.println("QHRS..: " + QHRS(p) + " %");
		System.out.println("QMRN..: " + QMRN(p) + " %");
		System.out.println("PHRS..: " + PHRS(p) + " %");
		System.out.println("PMRN..: " + PMRN(p) + " %");
	}
	
	public static int QHRS(Pesquisa [] p) {
		int qhrs = 0;
		for(Pesquisa a:p)
			if (a.getSexo()=='M' && a.getResposta()=='S')
				qhrs++;
		return qhrs;
	}
	
	public static int QMRN(Pesquisa [] p) {
		int qmrn = 0;
		for(Pesquisa a:p)
			if (a.getSexo()=='F' && a.getResposta()=='N')
				qmrn++;
		return qmrn;
	}
	
	public static double PHRS(Pesquisa [] p) {
		double cthomem = 0;
		for(Pesquisa a:p)
			if (a.getSexo()=='M')
				cthomem++;
		return QHRS(p)/cthomem * 100.0;
	}
	
	public static double PMRN(Pesquisa [] p) {
		double ctmulher = 0;
		for(Pesquisa a:p)
			if (a.getSexo()=='F')
				ctmulher++;
		return QMRN(p)/ctmulher * 100.0;
	}

	
    public static void fazPesquisa(Pesquisa[] p, int tipo) {
    	for(int i=0; i<p.length;i++) {
    		if(tipo==1) 
    			p[i]=getPesquisaAutomatica();
    		else 
    			p[i]=getPesquisaManual();
    	}
    }	
    
	public static Pesquisa getPesquisaAutomatica() {
		char sexo, resposta;
		sexo     = ml.nextBoolean()?'F':'M';
		resposta = ml.nextBoolean()?'S':'N';
		return new Pesquisa(sexo,resposta);
	}
	
	public static Pesquisa getPesquisaManual() {
		char sexo, resposta;
		do {
			System.out.print("Informe sexo (M/F).....: ");
			sexo = ze.nextLine().toUpperCase().charAt(0);
		} while (sexo != 'M' && sexo != 'F');
		
		do {
			System.out.print("Informe resposta (S/N).: ");
			resposta = ze.nextLine().toUpperCase().charAt(0);
		} while (resposta != 'S' && resposta != 'N');
	
		return new Pesquisa(sexo,resposta);
	}

}
