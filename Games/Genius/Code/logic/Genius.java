package logic;

import java.util.ArrayList;
import java.util.Random;

public class Genius {
    
    public enum Cor {
        VERMELHO,
        VERDE,
        AZUL,
        AMARELO
    }
    
    private ArrayList<Cor> coresSorteadas;
    private ArrayList<Cor> coresJogador;
    
    public Genius() {
        coresSorteadas = new ArrayList<Cor>();
        coresJogador = new ArrayList<Cor>();
    }

    public ArrayList<Cor> getCoresSorteadas() {
        return coresSorteadas;
    }

    public ArrayList<Cor> getCoresJogador() {
        return coresJogador;
    }

    public void sortearCor() {
        Random rnd = new Random();
        int idx = rnd.nextInt(4);
        Cor corSorteada = Cor.values()[idx];
        coresSorteadas.add(corSorteada);
    }  
    
    public void lerCorJogador(Cor corJogador) {
        coresJogador.add(corJogador);
    }

    public boolean compararSequencias() {
        for (int i = 0; i < coresSorteadas.size(); i++) {
            if (coresSorteadas.get(i) != coresJogador.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void limparCoresJogador() {
        this.coresJogador.clear();
    }
}
