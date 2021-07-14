package P3.p3E01;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */


public class P3E01 {
    public static void main(String[] args) {

        //pessoas criadas para teste
        Pessoa p1 = new Pessoa(1,"Joao", 1.86);
        Pessoa p2 = new Pessoa(2,"Jose", 1.76);
        Pessoa p3 = new Pessoa(3,"Ana", 1.57);
        Pessoa p4 = new Pessoa(4,"Mari", 1.60);
        Pessoa p5 = new Pessoa(5,"Joana", 1.90);
        //array de teste com as alturas
        double alturas [] = {p1.getAlturaPessoa(), p2.getAlturaPessoa(), p3.getAlturaPessoa(), p4.getAlturaPessoa(), p5.getAlturaPessoa()};

        System.out.println("A média aproximada das alturas das pessoas é: " + mediaAltura(alturas));
    }

    public static double mediaAltura(double [] altura) {
        double totalAltura = 0;
        for(int i = 0; i < altura.length; i++)
            totalAltura = totalAltura + altura[i];
        return Math.round(totalAltura / altura.length);

    }

}
