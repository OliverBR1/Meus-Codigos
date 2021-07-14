package P2PG52;

public class SaidaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(555555, 0);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.deposito(10000);
		System.out.println("Saldo: " + c1.getSaldo());
		c1.saque(1500);
		System.out.println("Saldo: " + c1.getSaldo());
		
		
	}
}
