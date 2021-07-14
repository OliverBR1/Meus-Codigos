public class P1E05 {
    public static void main(String[] args) {
        double dp = 5;
        double dg = 7.5;
        double pp = 5;
        double pg = 10;
        double pm = (pp + pg) / 2;
        double qtdLitros = dg * dp * pm * 785;
        System.out.println("Quantidade de litros necessários para encher a piscina: " + qtdLitros);
    }
}
