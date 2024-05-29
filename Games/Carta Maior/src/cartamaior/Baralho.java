package cartamaior;

import java.util.Random;


public class Baralho {
	private Carta[] vet;
	private int indice;
	
	public Baralho() {
		char[] naipes = {'P', 'C', 'E', 'O'};	// 'P' = Paus, 'C' = Copa, 'E' = Espada, 'O' = Ouros. 
			
		vet = new Carta[52];
		indice = 0;
		
		int k = 0;		
		for(int i = 0; i < 4; i++) {
			for(int j = 2; j < 15; j++) {
				vet[k] = new Carta(j, naipes[i]);
				k++;
			}
		}
	}	
	
	public void embaralha() {
		Random r = new Random();
		int j, k;
		Carta aux;
		
		indice = 0;
		
		for(Carta c: vet) {
			c.setStatus(false);
		}
		
		for(int i = 0; i < 500; i++) {
			j = r.nextInt(52);
			k = r.nextInt(52);
			
			aux = vet[j];				
			vet[j] = vet[k];
			vet[k] = aux;
		}
	}
	
	public Carta[] distribuiCartas(int quant) {
		Carta[] aux = new Carta[quant];
		
		if(indice < vet.length-quant) {	
			for(int i = 0; i < quant; i++) {
				aux[i] = vet[indice];
				indice++;
			}
			return aux;
		}		
		return null;
	}	
	
	public String toString() {
		String s = "";
		
		for(Carta c: vet) {
			s += c + ", ";
		}		
		return s;
	}
}