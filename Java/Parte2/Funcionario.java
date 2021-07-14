package P2PG48;

public class Funcionario {

	private String funcNome;
	private String funcCargo;
	private int funcId;
	private double funcSalario;

	Funcionario(String nome, String cargo, int id, double salario) {
		this.funcNome = nome;
		this.funcCargo = cargo;
		this.funcId = id;
		this.funcSalario = salario;
	}
	
	Funcionario() {
		
	}
	
	public void setNome(String nome) {
		this.funcNome = nome;
	}
	
	public void setCargo(String cargo) {
		this.funcCargo = cargo;
	}
	
	public void setId(int id) {
		this.funcId = id;
	}
	
	public void setSalario(double salario) {
		this.funcSalario = salario;
	}
	
	public String getNome() {
		return funcNome;
	}
	
	public String getCargo() {
		return funcCargo;
	}
	
	public int getId() {
		return funcId;
	}
	
	public double getSalario() {
		return funcSalario;
	}

	public double salarioAnual() {
		return funcSalario * 12;
	}
	
	public void setAumento(double percentual) {
		double salarioNovo = funcSalario * (1 + percentual/100);
		funcSalario = salarioNovo;
	}
	
	public void imprimirFicha() {
		System.out.println("Nome: " + funcNome);
		System.out.println("Cargo: " + funcCargo);
		System.out.println("ID: " + funcId);
		System.out.println("Salario: " + funcSalario);
	}
	
}
