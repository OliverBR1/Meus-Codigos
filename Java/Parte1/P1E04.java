public class P1E04 {
    public static void main(String[] args) {
        int hora = 1;
        int minuto = 30;
        int segundo = 30;
        int segDia = 86400;

        int conversaoMin = minuto * 60;
        int conversaoHora = hora * 60 * 60;
        int totalSeg = conversaoHora + conversaoMin + segundo;

        System.out.println("Total de segundos passados dede a 0h0min0s " + totalSeg);
        System.out.println("Total de segundos para a 0h0min0s " + (segDia - totalSeg));
    }
}
