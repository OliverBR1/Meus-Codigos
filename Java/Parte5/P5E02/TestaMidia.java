package P5E02;

public class TestaMidia {
    public static void main(String[] a) {
        
        DVD dvd = new DVD();

        CD cd = new CD();

        cd.inserirDados();
        dvd.inserirDados();

        cd.printDados();
        dvd.printDados();


    }
}
