package Polimorfismo;

public class Bovino extends Animal{
    public Bovino(String nome, String especie, int idade){
        super(nome,especie,idade);
    }

    public void som(){
        System.out.print(this.getNome()+":");
        System.out.println("Muuuu Muuuu!!");
    }
}
