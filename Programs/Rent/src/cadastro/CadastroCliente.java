package cadastro;

import java.util.ArrayList;

import entidade.Cliente;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;



public class CadastroCliente {
	private ArrayList<Cliente> lista;
		
	public CadastroCliente() {
		lista = new ArrayList<Cliente>();
	}
	
	public void inserirPF(String CPF, String nome, String endereco, String telefone) {
		PessoaFisica pf = new PessoaFisica(CPF, nome, endereco, telefone);
		lista.add(pf);		
	}
	
	public void inserirPJ(String CNPJ, String nomeFantasia, String endereco, String telefone) {
		PessoaJuridica pj = new PessoaJuridica(CNPJ, nomeFantasia, endereco, telefone);
		lista.add(pj);
	}
	
	// método que recebe um id e retorna o cliente com esse id. Retorna null caso não encontre o id.
	public Cliente consultarCliente(String id) {
		for(Cliente c: lista) {
			if(c.getId().equalsIgnoreCase(id)) {		// c.getId() "é igual ao parâmetro" id
				return c;
			}
		}
		return null;
	}
	
	// método que recebe um id e remove e retorna o cliente com esse id. Retorna null caso não encontre o id
	public Cliente removerCliente(String id) throws IllegalArgumentException{
		for(Cliente c: lista) {
			if(c.getId().equalsIgnoreCase(id)) {
				lista.remove(c);
				return c;
			}
		}
		throw new IllegalArgumentException("CPF/CNPJ " + id + " não cadastrado.");
	}
	
	
	public String listarTodos() {
		String spf = "## PESSOAS FÍSICAS\n";
		String spj = "\n## PESSOAS JURÍDICAS ##\n";
		
		PessoaFisica pf;
		PessoaJuridica pj;
		
		for(Cliente c: lista) {
			if(c instanceof PessoaFisica) {
				pf = (PessoaFisica) c;
				spf += pf + "\n";
			} else if(c instanceof PessoaJuridica){
				pj = (PessoaJuridica) c;
				spj += pj + "\n";
			}
		}
		return spf + "\n" + spj;
	}
	
	public String exportarTXTPessoaFisica() {
		String spf = "";
				
		PessoaFisica pf;
				
		for(Cliente c : lista) {
			if(c instanceof PessoaFisica) {
				pf = (PessoaFisica) c;
				spf += pf.getId() + ";" + pf.getNome() + ";" + pf.getEndereco() + ";" + pf.getTelefone() + "\n";
			}
		}
		
		return spf;
	}
	
	public String exportarTXTPessoaJuridica() {
		String spj = "";
		
		PessoaJuridica pj;
		
		for(Cliente c : lista) {
			if(c instanceof PessoaJuridica) {
				pj = (PessoaJuridica) c;
				spj += pj.getId() + ";" + pj.getNomeFantasia() + ";" + pj.getEndereco() + ";" + pj.getTelefone() + "\n";
			}
		}
		
		return spj;
	}

	
}
