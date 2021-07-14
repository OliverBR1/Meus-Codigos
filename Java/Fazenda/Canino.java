package FazendaFeliz;

public class Canino extends Animal {

	public Canino(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	@Override
	public void som() {
		System.out.print(this.getNome()+":");
		System.out.println("Au Au!!");
	}

}
