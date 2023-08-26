package programa;

import cadastro.CadastroCliente;
import entidade.Cliente;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class MenuCliente {
// ler todos os dados de uma pessoa física e inseri-la no cadastro
	public static void inserirPessoaFisica(CadastroCliente cadCliente) {		// static: método pertence à classe
		String cpf = Console.leString("Informe o CPF: ");
		String nome = Console.leString("Informe o nome: ");
		String endereco = Console.leString("Informe o endereço: ");
		String telefone = Console.leString("Informe o telefone: ");
				
		cadCliente.inserirPF(cpf, nome, endereco, telefone);
	}
	
	public static void inserirPessoaJuridica(CadastroCliente cadCliente) {
		String cnpj = Console.leString("Informe o CNPJ: ");
		String nome = Console.leString("Informe o nome: ");
		String endereco = Console.leString("Informe o endereço: ");
		String telefone = Console.leString("Informe o telefone: ");
				
		cadCliente.inserirPJ(cnpj, nome, endereco, telefone);
	}
	
	public static void consultarCliente(CadastroCliente cadCliente) {
		String id = Console.leString("Informe o CPF/CNPJ: ");
		Cliente c = cadCliente.consultarCliente(id);				// --> consultar 
		
		if(c == null) {
			System.out.println("CPF/CNPJ não cadastrado.");
		} else {
			if(c instanceof PessoaFisica) {
				System.out.println("Pessoa Física: " + (PessoaFisica) c);
			} else {
				System.out.println("Pessoa Jurídica: " + (PessoaJuridica) c);
			}
		}
	}
	
	public static void removerCliente(CadastroCliente cadCliente) {
		String id = Console.leString("Informe o CPF/CNPJ: ");
		try {
			Cliente c = cadCliente.removerCliente(id);					// --> remover
		
			if(c instanceof PessoaFisica) {
				System.out.println("Pessoa Física removida: " + (PessoaFisica) c);
			} else {
				System.out.println("Pessoa Jurídica removida: " + (PessoaJuridica) c);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void listarTodos(CadastroCliente cadCliente) {
		System.out.println(cadCliente.listarTodos());
	}
}

