package p5.p5E01;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class Divisao extends OperacaoMatematica{

    @Override
    public double calcular(double x, double y) {

        if(y==0) {
            throw new ArithmeticException("O divisor não pode ser zero");
        }
        return x / y;

    }
}
