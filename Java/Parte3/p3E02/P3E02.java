package P3.p3E02;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class P3E02 {

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random(new Date().getTime());

    public static void main(String[] args) {
        System.out.print("Pessoas pesquisadas: ");
        int qtdPessoas = Integer.parseInt(sc.nextLine());
        System.out.print("1 - Automática | 2 - Manual ");
        int tipo = Integer.parseInt(sc.nextLine());
        Pesquisa[] p = new Pesquisa[qtdPessoas];
        fazPesquisa(p,tipo);
        imprimeResultado(p);
        System.out.println("Fim da Pesquisa");

    }

    public static void imprimeResultado(Pesquisa[] p) {
        System.out.println("Quantidade de homens que responderam sim: " + QHRS(p));
        System.out.println("Quantidade de mulheres que responderam não: " + QMRN(p));
        System.out.println("Porcentagem de homens que responderam sim: " + Math.round(PHRS(p)) + " %");
        System.out.println("Porcentagem de mulheres que responderam não: " + Math.round(PMRN(p)) + " %");
    }

    public static int QHRS(Pesquisa[] p) {
        int qhrs = 0;
        for(Pesquisa a : p) {
            if(a.getSexo() == 'M' && a.getResposta() == 'S') {
                qhrs++;
            }
        }
        return qhrs;
    }

    public static int QMRN(Pesquisa[] p) {
        int qhrs = 0;
        for(Pesquisa a : p) {
            if(a.getSexo() == 'F' && a.getResposta() == 'N') {
                qhrs++;
            }
        }
        return qhrs;
    }

    public static double PHRS(Pesquisa[] p) {
        double cthomem = 0;
        for(Pesquisa a : p) {
            if(a.getSexo() == 'M') {
                cthomem++;
            }
        }
        return QHRS(p)/cthomem * 100.0;
    }

    public static double PMRN(Pesquisa[] p) {
        double ctmulher = 0;
        for(Pesquisa a : p) {
            if(a.getSexo() == 'F') {
                ctmulher++;
            }
        }
        return QMRN(p)/ctmulher * 100.0;
    }

    public static void fazPesquisa(Pesquisa[] p, int tipo) {
        for(int  i=0; i< p.length; i++) {
            if(tipo==1) {
                p[i] = getPesquisaAutomatica();
            } else {
                p[i] = getPesquisaManual();
            }
        }
    }

    public static Pesquisa getPesquisaAutomatica() {
        char sexo, resposta;
        //gerando dados randômicos (sem digitação)
        sexo = random.nextBoolean()? 'F' : 'M';
        resposta = random.nextBoolean()? 'S' : 'N';

        return new Pesquisa(sexo, resposta);

    }

    public static Pesquisa getPesquisaManual() {
        char sexo, resposta;
        do {
            System.out.print("Digite o sexo:\nF - feminino | M - masculino ");
            sexo = sc.nextLine().toUpperCase().charAt(0);
        } while (sexo!= 'M' && sexo != 'F');
        do {
            System.out.print("Digite a resposta\nS - para sim | N - para não: ");
            resposta =  sc.nextLine().toUpperCase().charAt(0);
        } while (resposta != 'S' && resposta != 'N');

        return new Pesquisa(sexo, resposta);
    }
}
