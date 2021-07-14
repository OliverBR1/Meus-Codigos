package P3.P3E04;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Cosseno {

    private Double x;
    private Double[] parcelas;
    private Double cosseno;


    public Cosseno() {}

    public Cosseno(Double x) {
        this.x = x;
        calculaParcelas();
        somaParcelas();
    }


    public void setParcelas(Double[] parcelas) {
        this.parcelas = parcelas;
    }


    public void calculaParcelas() {
        double parcela;
        Double [] arr = new Double[10];
        double op = 1;
        for(int i = 0; i < 10 ; i++) {
            int multi = i * 2;

            parcela = Math.pow(x, multi) / fatorial(multi) * op;
            arr[i] = parcela;
            op *= -1;
        }
        setParcelas(arr);
        System.out.println("As 10 primeiras parcelas são: " + Arrays.stream(parcelas).collect(Collectors.toList()));
    }

    public void somaParcelas() {
        double soma = 0;

        for (int i = 0; i < parcelas.length -1 ; i++) {

            soma = soma + parcelas[i];
        }
        System.out.println("A soma das parcelas é: " + soma);
    }


    private double fatorial(int valor) {
        double fatorial = 1;
        for(int i=2; i<=valor; i++)
            fatorial *= i;
        return fatorial;
    }




}