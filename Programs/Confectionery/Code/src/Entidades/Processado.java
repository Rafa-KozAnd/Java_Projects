package Entidades;

public class Processado extends Produto {
	
	
	//Atributos:
	private String marca;
	private String supermercado;

	
	//IngredientesInNatura:
	public Processado(String cod, String ingrediente, double qtaEmbalagem, String valor, String marca, String supermercado) {
		super(cod, ingrediente, qtaEmbalagem, valor);
		setMarca(marca);
		setSupermercado(supermercado);	
	}

	
	//Gets e Sets:
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getSupermercado() {
		return supermercado;
	}

	public void setSupermercado(String supermercado) {
		this.supermercado = supermercado;
	}

	
	//Construtor:
	public String toString() {
		return super.toString() + ". Marca: " + marca + ". SuperMercado: " + supermercado;
    }
  
}
