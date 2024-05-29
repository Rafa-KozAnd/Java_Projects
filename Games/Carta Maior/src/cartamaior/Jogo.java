package cartamaior;


public class Jogo {

	public static void main(String[] args) {
		Baralho b = new Baralho();
		Carta[] bUsu, bComp;
		Carta cUsu, cComp;
		
		int contJ, contR, op, pontosJ, pontosC;
		char continuar;
		
		do {
			contJ = 0;
			pontosJ = 0;
			pontosC = 0;
			
			System.out.println("\nBaralho criado");
			System.out.println(b);
			b.embaralha();
			System.out.println("\nEmbaralhado");
			System.out.println(b);	
			
			do {				
				bUsu = b.distribuiCartas(5);
				bComp = b.distribuiCartas(5);
				contR = 0;
					
				do {
					System.out.println("\nRodada " + (contR+1));
										
					cComp = bComp[contR];
					System.out.println("Carta do computador: " + cComp);
					
					op = menuCarta(bUsu);
					
					cUsu = bUsu[op];
					cUsu.setStatus(true);
					
					System.out.println("Carta do jogador...: " + cUsu);
					System.out.println("Carta do computador: " + cComp);
					
					if(cUsu.getValor() > cComp.getValor()) {
						System.out.println("\nVoce ganhou! Sua carta eh de maior valor!");
						pontosJ++;
						
						if(cUsu.getNaipe() == cComp.getNaipe()) {
							System.out.println("Naipes iguais! Ganha mais um ponto!");
							pontosJ++;
						}
					} else if(cComp.getValor() > cUsu.getValor()) {
						System.out.println("\nO computador venceu! A carta dele eh de maior valor!");
						pontosC++;
						
						if(cUsu.getNaipe() == cComp.getNaipe()) {
							System.out.println("Naipes iguais! Ganha mais um ponto!");
							pontosC++;
						}
					} else if(cComp.getValor() == cUsu.getValor()) {
						System.out.println("\nEmpate! Ninguem ganhou ponto!");
					}
					contR++;
					
					System.out.println("Pontos do usuario " + pontosJ + " x " + pontosC + " Pontos do computador");
				}while(contR < 5);
				
				System.out.println("Fim do jogo");
				
				continuar = Console.leChar("\nDeseja jogar novamente: (S)im/(N)ao? ");
				if(continuar == 's' || continuar == 'S') {
					contJ++;
					continue;
				} else if(continuar != 'n' && continuar != 'N') {
					break;
				}				
			} while(contJ < 5);
			
			continuar = Console.leChar("\nDeseja reiniciar o jogo: (S)im/(N)ao? ");
		}while(continuar == 'S' || continuar == 's');
	}
	
	public static int menuCarta(Carta[] vet) {
		int op = 0;
				 
		while(true){
			System.out.println("Escolha uma carta:");
			for(int i = 0; i < vet.length; i++){
				if(vet[i].isStatus() == false)
					System.out.println((i + 1) + ". " + vet[i]);
				}			
		
			while(true) {
				op = Console.leInt("Opcao: ");
				op--;
			
				if (op >= 0 && op < vet.length && vet[op].isStatus() == false) {
					return op;
				}
				else {
					System.out.println("Opcao invalida");
				}
				
			}
		}
	}
}