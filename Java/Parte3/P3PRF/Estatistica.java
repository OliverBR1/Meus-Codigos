package P3.P3PRF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Estatistica {

    private Double[] valores;

    public Estatistica() {}

    public Estatistica(Double[] valores) {
        this.valores = valores;
    }

    public Double[] getValores() {
        return valores;
    }

    public void setValores(Double[] valores) {
        this.valores = valores;
    }

    public void imprimirValores() {
        for(double x: valores) {
            System.out.println(x);
        }
    }

    public void ordena() {
        for(int i = 0; i < valores.length; i++) {
            double step = 0;
            for(int j = 0; j < valores.length; j++) {
                if(valores[i] < valores[j]) {
                    step = valores[i];
                    valores[i] = valores[j];
                    valores[j] = step;
                }
            }
        }

       /* Outra solução
       *
        int n = valores.length;
        while(n-- > 0) {
            for(int i=0; i < valores.length - 1  ; i++) {

                if(valores[i] > valores[i+1]) {
                    double maior = valores[i];
                    valores[i] = valores[i+1];
                    valores[i+1]=maior;
                }
            }
        }
       * */

    }

    public double getMedia() {
        double soma = 0;
        for(double valor : valores) {
            soma = soma + valor;
        }
        return soma / valores.length;
    }

    public List<Double> getModa() {
        int count;
        int maxCount = 0;
        List moda = new ArrayList();

        for( int i = 0; i < valores.length ; i++) {
            count = 0;

            for(int j = i+1; j < valores.length; j++) {
                if (valores[i].equals(valores[j])) {
                    count++;
                }
            }

            if(count > maxCount) {
                moda.clear();
                moda.add(valores[i]);
                maxCount = count;
            } else if(count == maxCount) {
                if(!(moda.contains(valores[i]))) {

                    moda.add(valores[i]);
                }
            }
        }
        if(Arrays.asList(valores).equals(moda)) {
            moda.clear();
        }

        return moda;
    }

    public void getMediana() {
        Double[] valores = getValores();
        ordena();

        if(valores.length % 2 == 0) {
            double elemento1 = valores[(valores.length / 2)-1];
            double elemento2 = valores[valores.length / 2];
            double mediana = (elemento1 + elemento2) / 2;
            System.out.println("Mediana: " +  mediana);
        } else {
            double mediana2 = (valores.length /2 + 0.5);
            System.out.println("Mediana: " + valores[(int) mediana2]);
        }
    }

    public double getVariancia() {
        double auxiliar = 0;
        double variancia = 0;
        double total = 0;
        for(int i = 0; i < valores.length; i++) {
            auxiliar = Math.pow((valores[i] - getMedia()), 2);
            total = total + auxiliar;
            variancia = total / (double)valores.length;
        }
        return variancia;
    }

    public double getDesvioPadrao() {
        return Math.sqrt(getVariancia());

    }
}

