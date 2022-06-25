package logica;

// Imports
import javax.swing.JOptionPane;

// Chamados de classe
import grafica.FrmMemoriaGenius;


public class Main {
    public static void main(String[] args) {
        
        // Variáveis
        MemoriaGenius logicaGenius = new MemoriaGenius();
        FrmMemoriaGenius frm = new FrmMemoriaGenius(logicaGenius);

        // Visibilidade Janela
        frm.setVisible(true);

        do {
            logicaGenius.zerarPontuacao();
            int rodada = 1;
            logicaGenius.limparCoresSorteadas();
            do {
                JOptionPane.showMessageDialog(frm, String.format(("\nRodada: #"+ rodada +"\nPontuação atual = " + logicaGenius.getPontuacao())),
                                                                                                             "Jogo da Memória -- Genius", JOptionPane.INFORMATION_MESSAGE);

                logicaGenius.sortearCor();
                frm.animationBtns();
                logicaGenius.limparCoresJogador();

                while (logicaGenius.isAguardandoCores()){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                rodada++;
            } while ( logicaGenius.compararSequencias());
        }while(JOptionPane.showOptionDialog(frm, ("FIM DE JOGO!!!\n\nSua pontuacao final foi = " + logicaGenius.getPontuacao() + "\n\nGostaria de jogar denovo?"),
                                                                                     "Jogo da Memória -- Genius", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.YES_OPTION);
        
        // Fechamento Janela
        frm.setVisible(false);
        frm.dispose();
    }
}
