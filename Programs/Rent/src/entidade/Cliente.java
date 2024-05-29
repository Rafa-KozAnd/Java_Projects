package entidade;			// a classe Cliente é do pacote entidade

public abstract class Cliente {
	private String id;
	private String endereco;
	private String telefone;
		
	public Cliente(String id, String endereco, String telefone) {
		setId(id);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Id: " + id + " Endereço: " + endereco + " Telefone:" + telefone;
	}
	
	

}
