package Programas;

//Imports:
import java.util.Scanner;

public class Console{
	private static Scanner teclado = new Scanner(System.in);
	
	// m�todo que l� uma String do teclado
	public static String leString(){
		return teclado.nextLine();
					
	}
	
	// m�todo que mostra uma mensagem na tela e l� uma String do teclado.
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
	
	
	// m�todo que mostra uma mensagem na tela e l� um int do teclado.
	// caso o valor digitado n�o seja um n�mero inteiro, repete a amostragem e a leitura
	public static int leInt(String txt){
		while (true){
			try{
				return Integer.parseInt (leString(txt));				
			}catch (NumberFormatException e){
				System.out.println("N�mero Inv�lido");
			}
		}
	}
	
	// m�todo que mostra uma mensagem e l� um int do teclado, considerando um intervalo v�lido de n�meros
	// caso o valor digitado n�o seja um n�mero inteiro, repete a amostragem e a leitura
	public static int leInt(String txt, int min, int max){
		int n;
		while (true){
			try{
				n = Integer.parseInt (leString(txt + "(" + min + " a " + max + "): "));
				if(n < min || n > max) {
					System.out.println("N�mero fora do intervalo. Tente novamente.");
				} else {
					return n;
				}
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}

	
	// m�todo que mostra uma mensagem e l� um double do teclado
	// caso o valor digitado n�o seja um n�mero double, repete a amostragem e a leitura	
	public static double leDouble(String txt){
		while (true){
			try{
				return Double.parseDouble(leString(txt));
			}catch (NumberFormatException e){
				System.out.println("Numero Invalido");
			}
		}
	}	
	
	// m�todo que mostra uma mensagem e l� um char do teclado
	// caso o valor digitado n�o seja um caracter, repete a amostragem e a leitura	
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
	
	// m�todo que apresenta um menu na tela e retorna o n�mero da op��o selecionada
	public static int menu(String titulo, String[] opcoes){
		int op = 0;
		 
		while(true){
			System.out.println(titulo);
			for(int i = 0; i < opcoes.length; i++){
				System.out.println((i + 1) + ". " + opcoes[i]);
			}
			op = leInt("Op��o: ");
			
			if (op > 0 && op <= opcoes.length)
				return op;
			else
				System.out.println("Op��o inv�lida");
				
		}
	}
	
	// m�todo que encerra a execu��o
	public static void close() {
		if(teclado != null)
			teclado.close();
	}
}	
