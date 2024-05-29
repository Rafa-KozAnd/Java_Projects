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
		
		String[] opcoes = {"Cadatro de clientes", "Cadastro de ve�culos", "Alugu�is", "Devolu��es", "Sair"};
		int op;
		
		do {
			// mostrar op��es e ler op��o do usu�rio
			op = Console.menu("## ALUGUEL DE VE�CULOS ##", opcoes);
			
			// direcionar a execu��o
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
		String[] opcoes = {"Inserir pessoa f�sica", "Inserir pessoa jur�dica", "Consultar cliente", "Remover cliente", "Listar todos", "Voltar"};
		int op;
		
		do {
			// mostrar op��es e ler op��o do usu�rio
			op = Console.menu("## CADASTRO DE CLIENTES ##", opcoes);
			
			// direcionar a execu��o
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
		String[] opcoes = {"Inserir autom�vel", "Inserir caminh�o", "Consultar ve�culo", "Remover ve�culo", "Listar todos", "Voltar"};
		int op;
		
		do {
			System.out.println();
			op = Console.menu("## CADASTRO DE VE�CULOS ##", opcoes);
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

	
