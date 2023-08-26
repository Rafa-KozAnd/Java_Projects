package programa;

import cadastro.CadastroVeiculo;
import entidade.Automovel;
import entidade.Caminhao;
import entidade.Veiculo;

public class MenuVeiculo {
	public static void inserirAutomovel(CadastroVeiculo cadVeiculo) {
		String placa = Console.leString("Informe a placa: ");
		Veiculo v = cadVeiculo.consultarVeiculo(placa);
		if(v == null) {
			int km = Console.leInt("Informe a kilometragem: ");		
			double bagageiro = Console.leDouble("Informe a capacidade do bagageiro: ");
			int portas = Console.leInt("Informe o n�mero de portas: ");
			cadVeiculo.inserirAutomovel(placa, km, bagageiro, portas);			
		} else {
			System.out.println("Placa j� cadastrada.");
		}
	}
	
	public static void inserirCaminhao(CadastroVeiculo cadVeiculo) {
		String placa = Console.leString("Informe a placa: ");
		Veiculo v = cadVeiculo.consultarVeiculo(placa);
		if(v == null) {
			int km = Console.leInt("Informe a kilometragem: ");		
			double carga = Console.leDouble("Informe a capacidade de carga: ");
			cadVeiculo.inserirCaminhao(placa, km, carga);			
		} else {
			System.out.println("Placa j� cadastrada.");
		}
	}
	
	public static void consultarVeiculo(CadastroVeiculo cadVeiculo) {
		String placa = Console.leString("Informe a placa: ");
		
		Veiculo v = cadVeiculo.consultarVeiculo(placa);
	
		if(v == null) {
			System.out.println("Placa n�o cadastrada.");
		}
		if(v instanceof Automovel) {
			Automovel a = (Automovel) v;
			System.out.println("Autom�vel: " + a);
		} else if(v instanceof Caminhao) {
			Caminhao c = (Caminhao) v;
			System.out.println("Caminh�o: " + c);
		}			
			
	}
	
	public static void removerVeiculo(CadastroVeiculo cadVeiculo) {
		String placa = Console.leString("Informe a placa: ");
		try {
			Veiculo v = cadVeiculo.removerVeiculo(placa);
			
			if(v instanceof Automovel) {
				Automovel a = (Automovel) v;
				System.out.println("Autom�vel removido: " + a);
			} else if(v instanceof Caminhao) {
				Caminhao c = (Caminhao) v;
				System.out.println("Caminh�o removido: " + c);
			}			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void listarVeiculos(CadastroVeiculo cadVeiculos) {
		System.out.println("\n" + cadVeiculos.listarTodos());
	}
}
