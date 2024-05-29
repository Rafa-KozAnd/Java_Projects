package Entidades;

public class InNatura extends Produto {

	
	//Atributos:
	private String produtor;
	private String cidade;
	private double desconto;

	
	//IngredientesInNatura:
	public InNatura(String cod, String ingrediente, double qtaEmbalagem, String valor, String produtor, String cidade, double desconto) {
		super(cod, ingrediente, qtaEmbalagem, valor);
		setProdutor(produtor);
		setCidade(cidade);
		setDesconto(desconto);
		
	}

	
	//Gets e Sets:
	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	
	//Construtor:
	public String toString() {
		return super.toString() + ". Produtor: " + produtor + ". Cidade: " + cidade + ". Desconto Exclusividade: " + desconto + ".";
    }

}
