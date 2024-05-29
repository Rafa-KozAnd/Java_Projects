package Programas;

//Imports:
import Cadastro.CadastroProdutos;

public class Principal {
     public static void main(String[] args) {
    	 
    	 //Atributos:
    	 CadastroProdutos cadProdutos = new CadastroProdutos();
    	 
    	 String[] opcoes = {"Inserir InNatura",
    			 			"Inserir Processado",
    			 			"Consultar Produtos",
    			 			"Remover Produtos",
    			 			"Listar InNatura",
    			 			"Listar Processado",
    			 			"Listar Todos",
    			 			"Sair"};
 			int op;

 			//MENU:
 			do {
 			
				op = Console.menu("\n----- CONFEITARIA - SEJA BEM-VINDO(A) -----\n", opcoes);
				
		
				switch(op) {
				case 1: MenuProdutos.inserirInNatura(cadProdutos);
				break;
				case 2: MenuProdutos.inserirProcessado(cadProdutos);
				break;
				case 3: MenuProdutos.consultarProdutos(cadProdutos);
				break;
				case 4: MenuProdutos.removerProdutos(cadProdutos);
				break;
				case 5: MenuProdutos.listarInNatura(cadProdutos);
				break;
				case 6: MenuProdutos.listarProcessado(cadProdutos);
				break;
				case 7: MenuProdutos.listarTodos(cadProdutos);
				}		
			}while(op != opcoes.length);
 		

     }
}
