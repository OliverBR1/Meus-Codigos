package FazendaFeliz;

public abstract class Animal {
	protected String nome;
	protected String especie;
	protected int idade;

	public abstract void som();
	
	public Animal(String nome, String especie, int idade) {
		this.especie = especie;
		this.idade = idade;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getEspecie() {
		return especie;
	}

	public int getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
