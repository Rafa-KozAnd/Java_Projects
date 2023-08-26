package programa;



public class Cadastro {
	public static void inserir(ControleAluguel contAluguel) {
		String placa = Console.leString("Informe a placa: ");
		Veiculo v = cadVeiculo.consultarVeiculo(placa);
		if(v == null) {
			int km = Console.leInt("Informe a kilometragem: ");		
			double bagageiro = Console.leDouble("Informe a capacidade do bagageiro: ");
			int portas = Console.leInt("Informe o número de portas: ");
			cadVeiculo.inserirAutomovel(placa, km, bagageiro, portas);			
		} else {
			System.out.println("Placa já cadastrada.");
		}
}
