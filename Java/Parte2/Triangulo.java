package P2PG50;

public class Triangulo {
	
	private double base;
	private double altura;
	double perimetro = getTriPeri();
	double area = getTriArea();
	
	Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getTriArea() {
		return base * altura / 2;
	}
	
	public double getTriPeri() {
		return base + altura + (Math.sqrt(base * base + altura * altura));
	}
	
	public String toString() {
		return "Area: " + area + "Perimetro: " + perimetro;
	}
}

