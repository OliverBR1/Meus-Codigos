package Heranca;

public class Funcionario extends Pessoa{
    protected int matricula;
    protected String cargo;

    public Funcionario(int id, String nome, double altura, int matricula, String cargo){
        super(id,nome,altura);
        System.out.println("Construtor da subclasse");
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Matricula: " + matricula);
        System.out.println("Cargo: " + cargo);
    }
}
