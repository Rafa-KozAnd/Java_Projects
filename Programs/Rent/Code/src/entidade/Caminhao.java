package entidade;

public class Caminhao extends Veiculo {
	private double carga;
	
	public Caminhao(String placa, int km, double carga) {
		super(placa, km);
		setCarga(carga);
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	public String toString() {
		return super.toString() + " - Capac. de carga: " + carga;
	}
}
