package FazendaFeliz;

public class Bovino extends Animal {

	public Bovino(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	@Override
	public void som() {
		System.out.print(this.getNome()+":");
		System.out.println("Muuuu Muuuuu!!");
	}
}