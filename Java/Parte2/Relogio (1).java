package P2PG54;

public class Relogio {
	
	private int hora;
	private int min;
	private int seg;

	
	Relogio(int hora, int min, int seg){
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getSeg() {
		return seg;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
		
	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	
	public int getHoraParaSeg() {
		int horaParaSeg = (hora * 60 * 60) + min * 60 + seg;
		return horaParaSeg;
	}
		
	public String getAdiantaHora(int seg) {
		double segTotal = getHoraParaSeg() + seg;
		int convertMilhares = (int) (segTotal * 10000) / 60 /60;
		int horaAtual = convertMilhares / 10000;
		int minAtual = ((convertMilhares % 10000) * 60 / 10000);
		int segAtual = (int) (segTotal % 60);
		return horaAtual + ":" + minAtual + ":" + segAtual;
	}
	
	public String getAtrasaHora(int seg) {
		double segTotal = getHoraParaSeg() - seg;
		int convertMilhares = (int) (segTotal * 10000) / 60 /60;
		int horaAtual = convertMilhares / 10000;
		int minAtual = ((convertMilhares % 10000) * 60 / 10000);
		int segAtual = (int) (segTotal % 60);
		return horaAtual + ":" + minAtual + ":" + segAtual;
	}
	
}
