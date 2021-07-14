package P2PG52;

public class ContaCorrente {
	
	private int numCC;
	private double saldo;

	ContaCorrente(int numCC, double saldo){
		this.numCC = numCC;
		this.saldo = saldo;
	}
		
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
		
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumCC() {
		return numCC;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void saque(double saque) {
		saldo = saldo - saque;
	}
}
