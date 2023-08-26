package cadastro;

import java.util.ArrayList;



import entidade.Automovel;
import entidade.Caminhao;
import entidade.Veiculo;


public class CadastroVeiculo {

	private ArrayList<Veiculo> lista;
	
	public CadastroVeiculo() {
		lista = new ArrayList<Veiculo>();
	}
	
	public void inserirAutomovel(String placa, int km, double bagageiro, int portas) {
		Automovel a = new Automovel(placa, km, bagageiro, portas);
		lista.add(a);
	}
	
	public void inserirCaminhao(String placa, int km, double carga) {
		Caminhao c = new Caminhao(placa, km, carga);
		lista.add(c);
	}
	
	public Veiculo consultarVeiculo(String placa) {
		for(Veiculo v: lista) {
			if(v.getPlaca().equalsIgnoreCase(placa)) {
				return v;
			}
		}
		return null;
	}
	
	public Veiculo removerVeiculo(String placa) {
		for(Veiculo v: lista) {
			if(v.getPlaca().equalsIgnoreCase(placa)) {
				lista.remove(v);
				return v;
			}
		}
		throw new IllegalArgumentException("Placa " + placa + " não cadastrada.");
	}
	
	public String listarTodos() {
		String sa = "VEÍCULOS CADASTRADOS\nAUTOMÓVEIS\n";
		String sc = "\nCAMINHÕES\n";
		
			
		for(Veiculo v : lista) {
			if(v instanceof Automovel) {
				sa += (Automovel) v;
				sa += "\n";
			} else if(v instanceof Caminhao) {
				sc += (Caminhao) v;
				sc += "\n";
			}
		}
		
		return sa + sc;		
	}
	
	public String exportarTXTAutomovel() {
		String sa = "";
				
		Automovel a;
				
		for(Veiculo v: lista) {
			if(v instanceof Automovel) {
				a = (Automovel) v;
				sa += a.getPlaca() + ";" + a.getKm() + ";" + a.getBagageiro() + ";" + a.getPortas() + "\n";
			}
		}
		
		return sa;
	}
	
	public String exportarTXTCaminhao() {
		String sc = "";
				
		Caminhao c;
				
		for(Veiculo v: lista) {
			if(v instanceof Caminhao) {
				c = (Caminhao) v;
				sc += c.getPlaca() + ";" + c.getKm() + ";" + c.getCarga() + "\n";
			}
		}
		
		return sc;
	}
	
}
