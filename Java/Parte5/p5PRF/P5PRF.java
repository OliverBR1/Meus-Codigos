import java.util.Scanner;

public class P5PRF {
	public static Scanner ze = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Tipo de Lampada...(0/1): ");
		int tipo = Integer.parseInt(ze.nextLine());
		FabricaLampada philips = new FabricaLampada();
		Lampada lamp = philips.construir(tipo);
		lamp.ligar();
		lamp.desligar();
		FabricaLampada.imprime();
	}
}
