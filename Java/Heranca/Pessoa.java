package Heranca;

public class Pessoa {
    protected int id;
    protected String nome;
    protected double altura;

    public Pessoa(){
        System.out.println("Construtor vazio da superclasse");
    }

    public Pessoa(int id, String nome, double altura){
        System.out.println("Construtor da superclasse");
        this.id = id;
        this.nome = nome;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprime(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
    }
}
