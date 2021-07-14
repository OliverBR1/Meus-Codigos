package p4;

/**
 * BRQ Entry Point - Grande Porte
 * @Author: Grupo 6: Bruno Oliveira, Paula Buscácio, Suleiman Divério, Valter Neto
 * */

public class P4E04 {
    public static void main(String[] args) throws Exception {
        metodoA();
    }


    public static void metodoA() throws Exception {
        System.out.println("Início método A");
        metodoB();
        System.out.println("Saída método A");

    }
    public static void metodoB() throws Exception {
        System.out.println("Início método B");
        metodoC();
        System.out.println("Saída método B");

    }
    public static void metodoC() throws Exception {
        System.out.println("Início método C");
        metodoD();
        System.out.println("Saída método C");
    }

    public static void metodoD() throws Exception {
        System.out.println("Início método D");
        System.out.println("Saída método D");
        throw new Exception("Exceção lançada, não chame metodoA novamente: Cuidado com o Stack Overflow!!!");

    }

}
