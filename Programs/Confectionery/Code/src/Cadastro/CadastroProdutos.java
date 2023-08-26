package Cadastro;

//Imports:
import java.util.ArrayList;
import Entidades.InNatura;
import Entidades.Processado;
import Entidades.Produto;




public class CadastroProdutos {
	
	
	//Atributos:
    private ArrayList<Produto> lista;

    
    //CadastroInNatura:
    public CadastroProdutos(){
    	lista = new ArrayList<Produto>();
    }

    
	//Inserir Processados & InNatura:
    public void inserirProcessado(String cod, String ingrediente, double qtaEmbalagem, String valor, String marca, String supermercado) {
		Processado pp = new Processado(cod, ingrediente, qtaEmbalagem, valor, marca, supermercado);
		lista.add(pp);
	}
	
    public void inserirInNatura(String cod, String ingrediente, double qtaEmbalagem, String valor, String produtor, String cidade, double desconto) {
		InNatura ina = new InNatura(cod, ingrediente, qtaEmbalagem, valor, produtor, cidade, desconto);
		lista.add(ina);
	}
    
    
	//M�todo:
    //Consultar:
    public Produto consultarProdutos(String cod) throws IllegalArgumentException  {
	    for(Produto p: lista) {
	        if(p.getCod().equalsIgnoreCase(cod)) {
	            return p;
	        }
	    }
	    throw new IllegalArgumentException("C�digo " + cod + " n�o encontrado.");
    }
    
    //Remover:
    public Produto removerProdutos(String cod) throws IllegalArgumentException{
        for(Produto p: lista) {
            if(p.getCod().equalsIgnoreCase(cod)) {
                lista.remove(p);
                return p;
            }
        }
        throw new IllegalArgumentException("C�digo " + cod + " n�o encontrado.");
    }

    
	//Listagens:
    //Processado & InNatura:
    public String listarProcessado() {
		String lp = "\nPROCESSADOS\n";
		
		
		Processado pp;
		
		
		for(Produto p: lista) {
			if(p instanceof Processado) {
				pp = (Processado) p;
				lp += pp + "\n";
			} 
		}
		return lp;
	}
    
    public String listarInNatura() {
		String ln = "\nInNatura\n";
		
		
		InNatura ina;
		
		
		for(Produto p: lista) {
			if(p instanceof InNatura) {
				ina = (InNatura) p;
				ln += ina + "\n";
			} 
		}
		return ln;
	}
    
    
	//Listagem de Tudo:
    public String listarTodos() {
		String ln = "\nInNatura\n";
		String lp = "PROCESSADOS\n";
		
		Processado pp;
		InNatura ina;
		
		for(Produto p: lista) {
			if(p instanceof InNatura) {
				ina = (InNatura) p;
				ln += ina + "\n";
			} else if(p instanceof Processado){
				pp = (Processado) p;
				lp += pp + "\n";
			}
		}
		return ln + "\n" + lp;
	}

}
