package P2PG48;

public class SaidaFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("Suleiman", "Programador", 9, 15000);
		Funcionario func2 = new Funcionario("Samir", "PO", 23, 50000);
		Funcionario func3 = new Funcionario();
		
		System.out.println(func1.getNome());
		
		func3.setNome("Sonia");
		func3.setCargo("CEO");
		func3.setId(1);
		func3.setSalario(100000);
		
		System.out.println(func1.salarioAnual());
		System.out.println(func2.salarioAnual());
		System.out.println(func3.salarioAnual());
		
		func2.imprimirFicha();
		
		func1.setAumento(10);
		System.out.println(func1.salarioAnual());
	}
}
