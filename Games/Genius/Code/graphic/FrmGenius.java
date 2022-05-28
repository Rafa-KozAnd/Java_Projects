package graphic;

import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import logic.Genius;
import logic.Genius.Cor;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class FrmGenius extends JFrame {
    private Genius logicaGenius;
    private JButton btnVermelho;
    private JButton btnVerde;
    private JButton btnAzul;
    private JButton btnAmarelo;

    public FrmGenius() {
        this.logicaGenius = new Genius();
        this.setLayout(new GridLayout(2, 2, 10, 10));

        btnVermelho = new JButton();
        btnVermelho.setBackground(Color.RED);
        this.add(btnVermelho);

        btnVerde = new JButton();
        btnVerde.setBackground(Color.GREEN);
        this.add(btnVerde);

        btnAzul = new JButton();
        btnAzul.setBackground(Color.BLUE);
        this.add(btnAzul);

        btnAmarelo = new JButton();
        btnAmarelo.setBackground(Color.YELLOW);
        this.add(btnAmarelo);

        this.setSize(new Dimension(600, 600));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        InputMap inputMap = this.getRootPane().getInputMap(
            JComponent.WHEN_IN_FOCUSED_WINDOW);       
        
        AbstractAction iniciarJogo = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "O jogo vai começar, memorize a sequencia de cores!", 
                    "Atenção", JOptionPane.WARNING_MESSAGE);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                }
                logicaGenius.sortearCor();
                logicaGenius.sortearCor();
                logicaGenius.sortearCor();
                logicaGenius.sortearCor();
                animarBotoes();
            }
        };
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "iniciarJogo");
        this.getRootPane().getActionMap().put("iniciarJogo", iniciarJogo);
    }

    public void animarBotoes() {
        new Thread() {
            @Override
            public void run() {
                try {
                    for (Cor cor: logicaGenius.getCoresSorteadas()) {
                        switch (cor) {
                            case VERMELHO:
                                btnVermelho.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                btnVermelho.setBackground(Color.RED);
                                break;   
                            case VERDE:
                                btnVerde.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                btnVerde.setBackground(Color.GREEN);
                                break;                                                          
                            case AZUL:
                                btnAzul.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                btnAzul.setBackground(Color.BLUE);
                                break;                                 
                            case AMARELO:
                                btnAmarelo.setBackground(Color.GRAY);
                                Thread.sleep(500);
                                btnAmarelo.setBackground(Color.YELLOW);
                                break;                                 
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.run();
    }
}