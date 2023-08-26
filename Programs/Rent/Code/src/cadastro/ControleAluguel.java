package cadastro;

import java.time.LocalDateTime;
import java.util.ArrayList;

import entidade.Aluguel;
import entidade.Automovel;
import entidade.Cliente;
import entidade.Veiculo;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;




public class ControleAluguel {
	private ArrayList<Aluguel> lista;
	
	public ControleAluguel() {
		lista = new ArrayList<Aluguel>();
	}
	
	public void inserirCA(Cliente cliente, Veiculo veiculo, double ValorDiaria) {
		Aluguel ca = new Aluguel(cliente, veiculo, ValorDiaria);
		lista.add(ca);
	}
	
	public void inserirDV(Cliente cliente, Veiculo veiculo, double ValorDiaria) {
		Aluguel dv = new Aluguel(cliente, veiculo, ValorDiaria);
		lista.add(dv);
	}
	public Aluguel consultarAluguel(String placa) {
		for(Aluguel a: lista) {
			if(a.getPlaca().equalsIgnoreCase(placa)) {		
				return a;
			}
		}
		return null;
	}
	public Aluguel listarAtivos(boolean ativo) {
		for(Aluguel a: lista) {
			if(a.getAtivo==true) {
				
			}
		}
	}
}