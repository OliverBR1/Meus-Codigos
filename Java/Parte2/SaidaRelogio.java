package P2PG54;

public class SaidaRelogio {

	public static void main(String[] args) {
		
		Relogio c1 = new Relogio(12, 00, 00);
		//     seg 20120          5  35  20
		//                       18   5  50  
		System.out.println(c1.getHoraParaSeg());
		System.out.println(c1.getAdiantaHora(20120));
		System.out.println(c1.getAtrasaHora(6));
	}
}
