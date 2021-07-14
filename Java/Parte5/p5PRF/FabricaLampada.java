public class FabricaLampada {
	
	public static void imprime() {
		System.out.println("Fabrica de lâmpada!");
	}
	
	public Lampada construir(int tipo){
		if(tipo==0) 
			return new Incandescente();
		return new Fluorescente();		
	}

	public class Incandescente implements Lampada{
		public void ligar() {
			System.out.println("Lampada Incandescente Ligada!");
		}
		public void desligar() {
			System.out.println("Lampada Incandescente desligada!");
		}
	}
	
	public class Fluorescente implements Lampada{
		public void ligar() {
			System.out.println("Lampada Fluorescente Ligada!");
		}
		public void desligar() {
			System.out.println("Lampada Fluorescente desligada!");
		}
	}	
}