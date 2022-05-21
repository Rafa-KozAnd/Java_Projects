package cartamaior;

import java.util.Scanner;


public class Console{
	private static Scanner teclado = new Scanner(System.in);
	
	// metodo que le uma String do teclado
	public static String leString(){
		return teclado.nextLine();
					
	}
	
	// metodo que mostra uma mensagem na tela e le uma String do teclado.
	// caso a String seja nula ou em branco, repete a amostragem e a leitura.
	public static String leString (String txt){
		String str="";
		while (true){
			System.out.print(txt);
			str=teclado.nextLine();
			if (str!=null && !str.trim().equals(""))
				return str.trim();
		}
	}
	
	// metodo que mostra uma mensagem na tela e le um int do teclado.
	// caso o valor digitado nao seja um numero inteiro, repete a amostragem e a leitura
	public static int leInt(String txt){
		while (true){
			try{
				return Integer.parseInt (leString(txt));				
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}
	
	// metodo que mostra uma mensagem e le um int do teclado, considerando um intervalo valido de numeros
	// caso o valor digitado nao seja um numero inteiro, repete a amostragem e a leitura
	public static int leInt(String txt, int min, int max){
		int n;
		while (true){
			try{
				n = Integer.parseInt (leString(txt + "(" + min + " a " + max + "): "));
				if(n < min || n > max) {
					System.out.println("Numero fora do intervalo. Tente novamente.");
				} else {
					return n;
				}
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}
	
	// metodo que mostra uma mensagem e le um double do teclado
	// caso o valor digitado nao seja um numero double, repete a amostragem e a leitura	
	public static double leDouble(String txt){
		while (true){
			try{
				return Double.parseDouble(leString(txt));
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}	
	
	// metodo que mostra uma mensagem e le um char do teclado
	// caso o valor digitado nao seja um caracter, repete a amostragem e a leitura	
	// caso seja digitado um texto, retorna apenas o 1o. caracter
	public static char leChar(String txt){
		while (true){
			try{
				return leString(txt).charAt(0);
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}	
	
	// metodo que apresenta um menu na tela e retorna o numero da opcao selecionada
	public static int menu(String titulo, String[] opcoes){
		int op = 0;
		 
		while(true){
			System.out.println(titulo);
			for(int i = 0; i < opcoes.length; i++){
				System.out.println((i + 1) + ". " + opcoes[i]);
			}
			op = leInt("Opcao: ");
			
			if (op > 0 && op <= opcoes.length)
				return op;
			else
				System.out.println("Opcao invalida");
				
		}
	}
	
	// metodo que encerra a execucao
	public static void close() {
		if(teclado != null)
			teclado.close();
	}
}