package FazendaFeliz;

public class Galinaceo extends Animal {

	public Galinaceo(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}


	public void som() {
		System.out.print(this.getNome()+":");		
		System.out.println("Cocoricó!!");
	}

}
