package entidade;

public class PessoaFisica extends Cliente {
	private String nome;
	
	public PessoaFisica(String id, String nome, String endereco, String telefone) {
		super(id, endereco, telefone);
		setNome(nome);		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Id: " + getId() + " Nome: " + nome + " Endereco: " + getEndereco() + " Telefone: " + getTelefone();
	}
}
