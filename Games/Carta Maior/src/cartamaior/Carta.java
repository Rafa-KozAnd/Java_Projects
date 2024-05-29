package cartamaior;


public class Carta {
	private int valor;	
	private char naipe;
	private boolean status;					
	
	public Carta(int valor, char naipe) {
		setValor(valor);
		setNaipe(naipe);
		status = false;
	}

	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	public char getNaipe() {
		return naipe;
	}

	public void setNaipe(char naipe) {
		this.naipe = naipe;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String toString() {
		String s = "";
		
		switch(valor) {
		case 11: 
			s = "Q";
			break;
		case 12:
			s = "J";
			break;
		case 13:
			s = "K";
			break;
		case 14:
			s = "A";
			break;
		default:
			s += valor;
		}
		
		return s + "." + naipe;
	}
}
