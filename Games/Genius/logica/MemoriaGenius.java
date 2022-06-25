package logica;

// Imports
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MemoriaGenius {
    
    // Variáveis
    private List<Cores> coresSorteadas;
    private List<Cores> coresJogador;
    private int pontuacao = 0;

    // Lista de cores
    public enum Cores {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }
    
    public void setPontuacao() {
        this.pontuacao += 5;
    }

    public int getPontuacao() {
        return pontuacao;
    }
    public void zerarPontuacao() {
        this.pontuacao = 0;
    }

    public MemoriaGenius() {
        coresSorteadas = new ArrayList<Cores>();
        coresJogador = new ArrayList<Cores>();
    }

    public List<Cores> getCoresSorteadas() {
        return coresSorteadas;
    }

    public List<Cores> getCoresJogador() {
        return coresJogador;
    }

    public void sortearCor() {
        Random numeroAleatorio = new Random();
        int endereco = numeroAleatorio.nextInt(4);
        Cores corSorteada = Cores.values()[endereco];
        coresSorteadas.add(corSorteada);
    }  
    
    public void lerCorJogador(Cores corJogador) {
        coresJogador.add(corJogador);
    }

    public boolean compararSequencias() {
        for (int c = 0; c < coresSorteadas.size(); c++) {
            if (coresSorteadas.get(c) != coresJogador.get(c)) {
                return false;
            }
        }
        setPontuacao();
        return true;
    }

    public void limparCoresJogador() {
        this.coresJogador.clear();
    }

    public void limparCoresSorteadas(){
        this.coresSorteadas.clear();
    }
    public boolean isAguardandoCores() {
        return coresSorteadas.size() > coresJogador.size();
    }
}
