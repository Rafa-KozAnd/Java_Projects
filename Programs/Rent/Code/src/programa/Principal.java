package programa;

import java.io.IOException;

import cadastro.CadastroCliente;

import cadastro.CadastroVeiculo;
import cadastro.ControleAluguel;
import persistencia.Persistencia;
import persistencia.PersistenciaTXT;


public class Principal {

	public static void main(String[] args) {
		CadastroCliente cadCliente = new CadastroCliente();
		CadastroVeiculo cadVeiculo = new CadastroVeiculo();
		ControleAluguel contAluguel = new ControleAluguel();
		
		Persistencia persist = new PersistenciaTXT();
		persist.importarCadastroCliente(cadCliente);
		persist.importarCadastroVeiculo(cadVeiculo);
		persist.importarControleAluguel(cadCliente, cadVeiculo, contAluguel);
		
		String[] opcoes = {"Cadatro de clientes", "Cadastro de veículos", "Aluguéis", "Devoluções", "Sair"};
		int op;
		
		do {
			// mostrar opções e ler opção do usuário
			op = Console.menu("## ALUGUEL DE VEÍCULOS ##", opcoes);
			
			// direcionar a execução
			switch(op) {
			case 1: menuCadastroClientes(cadCliente);
			break;
			case 2: menuCadastroVeiculos(cadVeiculo);
			break;
			case 3: 
			break;
			case 4: 		
			}		
		}while(op != opcoes.length);
		
		try {

			persist.exportar(cadCliente, cadVeiculo, contAluguel);

		}catch(IOException e) {

			System.out.println(e.getMessage());

		}

	}
	
	public static void menuCadastroClientes(CadastroCliente cadCliente) {
		String[] opcoes = {"Inserir pessoa física", "Inserir pessoa jurídica", "Consultar cliente", "Remover cliente", "Listar todos", "Voltar"};
		int op;
		
		do {
			// mostrar opções e ler opção do usuário
			op = Console.menu("## CADASTRO DE CLIENTES ##", opcoes);
			
			// direcionar a execução
			switch(op) {
			case 1: MenuCliente.inserirPessoaFisica(cadCliente);
			break;
			case 2: MenuCliente.inserirPessoaJuridica(cadCliente);
			break;
			case 3: MenuCliente.consultarCliente(cadCliente);
			break;
			case 4: MenuCliente.removerCliente(cadCliente);
			break;
			case 5: MenuCliente.listarTodos(cadCliente);
			}		
		}while(op != opcoes.length);
	}
	
	public static void menuCadastroVeiculos(CadastroVeiculo cadVeiculo) {
		String[] opcoes = {"Inserir automóvel", "Inserir caminhão", "Consultar veículo", "Remover veículo", "Listar todos", "Voltar"};
		int op;
		
		do {
			System.out.println();
			op = Console.menu("## CADASTRO DE VEÍCULOS ##", opcoes);
			switch(op) {
			case 1: MenuVeiculo.inserirAutomovel(cadVeiculo);
			break;
			case 2: MenuVeiculo.inserirCaminhao(cadVeiculo);
			break;
			case 3: MenuVeiculo.consultarVeiculo(cadVeiculo);
			break;
			case 4: MenuVeiculo.removerVeiculo(cadVeiculo);
			break;
			case 5: MenuVeiculo.listarVeiculos(cadVeiculo);
			}
		}while(op != opcoes.length);
	}
}

	
