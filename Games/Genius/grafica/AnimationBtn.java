package grafica;

// Imports
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;

// Chamados de classe
import logica.MemoriaGenius;
import logica.MemoriaGenius.Cores;


public class AnimationBtn extends Thread {

    // Variáveis
    private JButton btnRED, btnGREEN, btnBLUE, btnYELLOW;
    private MemoriaGenius logicaGenius;

    // Método animar botões
    public AnimationBtn(JButton btnRED, JButton btnGREEN,  JButton btnBLUE, JButton btnYELLOW, MemoriaGenius logicaGenius) {
        this.logicaGenius = logicaGenius;
        this.btnRED = btnRED;
        this.btnGREEN = btnGREEN;
        this.btnBLUE = btnBLUE;
        this.btnYELLOW = btnYELLOW;
    } 

    @Override
    public void run(){
        try {
            for (Cores cor: logicaGenius.getCoresSorteadas()) {
                switch (cor) {
                    case RED:
                        btnRED.setBackground(Color.GRAY);
                        sleep(300);
                        btnRED.setBackground(Color.RED);
                        sleep(300);
                        break;   
                    case GREEN:
                        btnGREEN.setBackground(Color.GRAY);
                        sleep(300);
                        btnGREEN.setBackground(Color.GREEN);
                        sleep(300);
                        break;                                                          
                    case BLUE:
                        btnBLUE.setBackground(Color.GRAY);
                        sleep(300);
                        btnBLUE.setBackground(Color.BLUE);
                        sleep(300);
                        break;                                 
                    case YELLOW:
                        btnYELLOW.setBackground(Color.GRAY);
                        sleep(300);
                        btnYELLOW.setBackground(Color.YELLOW);
                        sleep(300);
                        break;                                 
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), 
                "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
