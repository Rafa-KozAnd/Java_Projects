package grafica;

// Imports
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;

// Chamados de classe
import logica.MemoriaGenius;
import logica.MemoriaGenius.Cores;


public class FrmMemoriaGenius extends JFrame {

    // Variáveis
    private MemoriaGenius logicaGenius;
    private JButton btnRED;
    private JButton btnGREEN;
    private JButton btnBLUE;
    private JButton btnYELLOW;

    // Layout da janela
    public FrmMemoriaGenius(MemoriaGenius logicaGenius) {

        this.logicaGenius = logicaGenius;

        // Layout
        this.setLayout(new GridLayout(2, 2, 10, 10));

        // Criando e Adicionando os botões
        // Botão Vermelho
        btnRED = new JButton();
        btnRED.setBackground(Color.RED);
        this.add(btnRED);

        // Botão Verde
        btnGREEN = new JButton();
        btnGREEN.setBackground(Color.GREEN);
        this.add(btnGREEN);

        // Botão Azul
        btnBLUE = new JButton();
        btnBLUE.setBackground(Color.BLUE);
        this.add(btnBLUE);

        // Botão Amarelo
        btnYELLOW = new JButton();
        btnYELLOW.setBackground(Color.YELLOW);
        this.add(btnYELLOW);

        // Configurações da janela (Tamanho, posição, etc)
        this.setSize(new Dimension(500, 500));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionando o evento de clique aos botões
        btnRED.addActionListener(new ActionBtn(Cores.RED, logicaGenius));
        btnGREEN.addActionListener(new ActionBtn(Cores.GREEN, logicaGenius));
        btnBLUE.addActionListener(new ActionBtn(Cores.BLUE, logicaGenius));
        btnYELLOW.addActionListener(new ActionBtn(Cores.YELLOW, logicaGenius));
    }        

    // Método para animar os botões
    public void animationBtns() {
        AnimationBtn animation = (new AnimationBtn(btnRED, btnGREEN, btnBLUE, btnYELLOW, logicaGenius));
        animation.start();
    }
}