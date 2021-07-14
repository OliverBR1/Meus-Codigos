package P2PG53;

public class SaidaAluno {

	public static void main(String[] args) {
		
		AlunoDisciplina a1 = new AlunoDisciplina(39, 5, 9.5, 8.5);
		System.out.println("Media aritmética: " + a1.getMediaArit());
		System.out.println("Media ponderada: " + a1.getMediaPond());
	}
}
