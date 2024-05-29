package Entidades;

public abstract class Produto {

	
	//Atributos:
	private String cod;
	private String ingrediente;
	private double qtaEmbalagem;
	private String valor;

	
	//Produtos:
	public Produto(String cod, String ingrediente, double qtaEmbalagem, String valor) {
		setCod(cod);
		setIngrediente(ingrediente);
		setqtaEmbalagem(qtaEmbalagem);
		setValor(valor);
	}

	
	//Gets e Sets:
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}


	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	
	public double getqtaEmbalagem() {
		return qtaEmbalagem;
	}

	public void setqtaEmbalagem(double qtaEmbalagem) {
		this.qtaEmbalagem = qtaEmbalagem;
	}
	
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	
	
	//Construtor:
	public String toString() {
		return "Produto: Código = " + cod + ". Ingrediente = " + ingrediente + ". Quantidade na Embalagem = " + qtaEmbalagem 
				+ ". Valor = " + valor;
	}
       
}
