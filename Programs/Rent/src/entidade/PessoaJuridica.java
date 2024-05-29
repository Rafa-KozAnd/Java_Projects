package entidade;

public class PessoaJuridica extends Cliente{
	private String nomeFantasia;
	
	public PessoaJuridica(String id, String nomeFantasia, String endereco, String telefone) {
		super(id, endereco, telefone);
		setNomeFantasia(nomeFantasia);		
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String toString() {
		return "Id: " + getId() + " Nome Fantasia: " + nomeFantasia + " Endereco: " + getEndereco() + " Telefone: " + getTelefone();
	}
}