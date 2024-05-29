package cartamaior;

public class Principal {

	public static void main(String[] args) {
		Baralho b = new Baralho();
		Carta[] bUsu, bComp;
		Carta cUsu, cComp;
		int rodada, cont;
		int pUsu, pComp;
		String op;
		
		cont = 0;
		b.embaralha();
		
		do {	
			bUsu = b.distribuiCartas(7);
			bComp = b.distribuiCartas(7);
			pUsu = 0;
			pComp = 0;
			
			for(rodada = 0; rodada < 7; rodada++) {
				System.out.println("\nRodada " + (rodada+1));
				
				cComp = bComp[rodada];
				System.out.println("Carta do computador: " + cComp);
				
				cUsu = menuCarta(bUsu);	
				cUsu.setStatus(true);
				System.out.println("Carta do usuario...:" + cUsu);
				System.out.println("Carta do computador: " + cComp);
				
				if(cUsu.getValor() > cComp.getValor()) {
					System.out.println("\nVoce ganhou! Sua carta eh de maior valor!");
					pUsu++;
					
					if(cUsu.getNaipe() == cComp.getNaipe()) {
						System.out.println("Naipes iguais! Ganhou mais um ponto!");
						pUsu++;
					}
				}else if(cComp.getValor() > cUsu.getValor()) {
					System.out.println("\nO computador venceu! A carta dele eh de maior valor!");
					pComp++;
					
					if(cUsu.getNaipe() == cComp.getNaipe()) {
						System.out.println("Naipes iguais! Ganhou mais um ponto!");
						pComp++;
					}
				}else{
					System.out.println("\nEmpate! Ninguem ganhou ponto.");
				}
				System.out.println("\n#---------------------------------------------------#");
				System.out.println("\n| Pontos do usuario " + pUsu + " x " + pComp + " Pontos do computador |");
				System.out.println("\n#---------------------------------------------------#");
			}
			
			op = Console.leString("Deseja jogar novamente: (S)im/(N)ao? ");
			cont++;
			
			if(cont == 7) {
				b.embaralha();
				cont = 0;
			}
		}while(op.equalsIgnoreCase("S"));
	}
	
	public static Carta menuCarta(Carta[] bUsu) {
		int op = 0;
		 
		System.out.println("Escolha uma carta:");
		for(int i = 0; i < bUsu.length; i++){
			if(bUsu[i].isStatus() == false) {
				System.out.println((i + 1) + ". " + bUsu[i]);
			}			
		}
	
		while(true) {
			op = Console.leInt("Opcao: ");
			op--;
		
			if (op >= 0 && op < bUsu.length && bUsu[op].isStatus() == false) {
				return bUsu[op];
			}
			else {
				System.out.println("Opcao invalida");
			}
		}		
	}
}