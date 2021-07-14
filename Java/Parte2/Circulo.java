package P2PG50;

public class Circulo {

	private double raio;
	private double pi = 3.14159;
	private double perimetro = getCircPeri();
	private double area = getCircArea();
	
	Circulo(double raio){
		this.raio = raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double getCircArea(){
		return area = pi * raio * raio;
	}
	
	public double getCircPeri() {
		return 2 * pi * raio;
	}	

	@Override
	public String toString() {
		return "Area: " + area
				+ "\nPerimetro: " + perimetro;
		
	}
}
