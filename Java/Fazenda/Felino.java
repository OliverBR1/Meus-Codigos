package FazendaFeliz;

public class Felino extends Animal {

	public Felino(String nome, String especie, int idade) {
		super(nome, especie, idade);
	}

	@Override
	public void som() {
		System.out.print(this.getNome()+":");		
		System.out.println("Miauu Miauu!!");
	}
}
