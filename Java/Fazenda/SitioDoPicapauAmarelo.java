package FazendaFeliz;

public class SitioDoPicapauAmarelo {
	public static void main(String [] a) {
		Bovino mimosa = new Bovino("mimosa","Bocivo",5);
		Canino rex = new Canino("Rex","Canino",3);
		Felino felix = new Felino("Felix","Felino",8);
		Galinaceo caipira = new Galinaceo("Caipira","Galinaceo",2);
		
		SonsDaFazenda f = new SonsDaFazenda();
		f.sonsDaFazenda(mimosa);
		f.sonsDaFazenda(rex);
		f.sonsDaFazenda(felix);
		f.sonsDaFazenda(caipira);
	}
}