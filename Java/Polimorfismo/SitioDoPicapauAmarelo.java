package Polimorfismo;

public class SitioDoPicapauAmarelo {
    public static void main(String[] a) {
        Bovino mimosa = new Bovino("mimosa","Bovino",5);
        Canino rex = new Canino("Rex","Canino", 10);
        Felino felix = new Felino("Felix","Felino",8);
        Galinaceo caipira = new Galinaceo("caipira","Galinaceo",2);

        SonsDaFazenda f = new SonsDaFazenda();
        f.sonsDaFazenda(mimosa);
        f.sonsDaFazenda(rex);
        f.sonsDaFazenda(felix);
        f.sonsDaFazenda(caipira);

    }
}
