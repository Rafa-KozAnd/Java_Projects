package entidade;

public abstract class Veiculo {
	private String placa;
	private int km;
	private boolean disponivel;
	
	public Veiculo(String placa, int km) {
		setPlaca(placa);
		setKm(km);
		disponivel = true;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String toString() {
		return "Placa: " + placa + " Kilometragem: " + km;
	}


}
