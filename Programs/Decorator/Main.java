package ativdecorator;

public class Main {
	
	public static void main (String args[]) {
		Food acai= new Acai();
		
		System.out.println(acai.getTs() + " R$ " + acai.cost());
		
		Food acaiNovo = new Acai();
		acaiNovo = new Morango(acaiNovo);
		acaiNovo = new Banana(acaiNovo);
		
		System.out.println(acaiNovo.getTs() + " R$ " + acaiNovo.cost());
	}

}