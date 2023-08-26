package entidade;

public class Automovel extends Veiculo {
	private double bagageiro;
	private int portas;

	
	public Automovel(String placa, int km, double bagageiro, int portas) {
		super(placa, km);
		setBagageiro(bagageiro);
		setPortas(portas);		
	}

	public double getBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(double bagageiro) {
		this.bagageiro = bagageiro;
	}

	
	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public String toString() {
		return super.toString() + " - Capac. do bagageiro: " + bagageiro + " - Qtde. de portas: " + portas;
	}

}
