package P2PG50;

public class SaidaTrianguloCirculo {

	public static void main(String[] args) {
		
		Circulo circ1 = new Circulo(3);
		System.out.println("Raio do circulo: " + circ1.getRaio());
		System.out.println("Area do circulo: " + circ1.getCircArea());
		System.out.println("Perimetro do circulo: " + circ1.getCircPeri());
		System.out.println();
		
		
		Triangulo tri1 = new Triangulo(5,7);
		System.out.println("Altura do quadrado: " + tri1.getAltura());
		System.out.println("Base do quadrado: " + tri1.getBase());
		System.out.println("Area do quadrado: " + tri1.getTriArea());
		System.out.println("Perimetro do quadrado: " + tri1.getTriPeri());
				
	}
}
