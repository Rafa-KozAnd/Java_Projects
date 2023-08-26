package Programas;

//Imports:
import Entidades.InNatura;
import Entidades.Processado;
import Entidades.Produto;
import Cadastro.CadastroProdutos;

public class MenuProdutos {
	
	
	//Inserir Produtos:
	//Inserir Processados:
	public static void inserirProcessado(CadastroProdutos cadProdutos) {
		    
		    String cod = Console.leString("\nInforme o codigo: ");
		    String ingrediente = Console.leString("Informe o ingrediente: ");		
			double qtaEmbalagem = Console.leDouble("Informe a quantidade da embalagem: ");
			String valor = Console.leString("Informe o valor: ");
			String marca = Console.leString("Informe a marca do produto: ");
			String supermercado = Console.leString("Informe o supermercado: ");
			
			System.out.println("\nItem Salvo!\n");
			cadProdutos.inserirProcessado(cod, ingrediente, qtaEmbalagem, valor, marca, supermercado);			
		} 
	
	//Iserir In Natura:
	public static void inserirInNatura(CadastroProdutos cadProdutos) {
	    
	    String cod = Console.leString("\nInforme o código: ");
	    String ingrediente = Console.leString("Informe o ingrediente: ");		
		double qtaEmbalagem = Console.leDouble("Informe a quantidade da embalagem: ");
		String valor = Console.leString("Informe o valor: ");
		String produtor = Console.leString("Informe o produtor: ");
		String cidade = Console.leString("Informe a cidade: ");
		double desconto = Console.leDouble("Informe o desconto: ");
		
		System.out.println("\nItem Salvo!\n");
		cadProdutos.inserirInNatura(cod, ingrediente, qtaEmbalagem, valor, produtor, cidade, desconto);			
	} 

	
	//Consultar:
	public static void consultarProdutos(CadastroProdutos cadProdutos) {
		String cod = Console.leString("Informe o código: ");		
		
		try {
			Produto p = cadProdutos.consultarProdutos(cod);
		
			if(p instanceof InNatura) {
				System.out.println("[InNatura] " + (InNatura) p);
			} else {
				System.out.println("[Processado] " + (Processado) p);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	
	//Remover:
	public static void removerProdutos(CadastroProdutos cadProdutos) {
		String cod = Console.leString("Informe o código: ");
		try {
			Produto p = cadProdutos.removerProdutos(cod);					
		
			if(p instanceof Processado) {
				System.out.println("Processado removido: " + (Processado) p);
			} else {
				System.out.println("InNatura removido: " + (InNatura) p);
			}
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	//Listagem:
	public static void listarProcessado(CadastroProdutos cadProdutos) {
		System.out.println(cadProdutos.listarProcessado());
    }
	
    public static void listarInNatura(CadastroProdutos cadProdutos) {
    	System.out.println(cadProdutos.listarInNatura());
    }

    public static void listarTodos(CadastroProdutos cadProdutos) {
    	System.out.println(cadProdutos.listarTodos());
    }

}

