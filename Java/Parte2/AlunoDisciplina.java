package P2PG53;

public class AlunoDisciplina {
	
	private int idAluno;
	private int idDisciplina;
	private double notaB1;
	private double notaB2;
	final private double PESONOTA1 = 0.4;
	final private double PESONOTA2 = 0.6;
		
	AlunoDisciplina(int idAluno, int idDisciplina, double nota1, double nota2){
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.notaB1 = nota1;
		this.notaB2 = nota2;
	}
	public void setIdAluno(int id) {
		this.idAluno = id;
	}
	
	public void setIdDisciplina(int id) {
		this.idDisciplina = id;
	}
	
	public void setNotaB1(double nota1) {
		this.notaB1 = nota1;
	}
	
	public int getIdAluno() {
		return idAluno;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setNotaB2(double nota2) {
		this.notaB2 = nota2;
	}
	
	public double getMediaArit() {
		return (notaB1 + notaB2) / 2;
	}
	
	public double getMediaPond() {
		return notaB1 * PESONOTA1 + notaB2 * PESONOTA2;
	}
	
	
	
}
