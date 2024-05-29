import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JogoAterrisagemFoguete extends JPanel implements KeyListener {
    private int larguraJanela = 600;
    private int alturaJanela = 400;
    private int posX = 300; // Posição inicial do foguete
    private int posY = 50;
    private int velocidadeY = 1; // Velocidade inicial do foguete
    private boolean gameOver = false;

    public JogoAterrisagemFoguete() {
        JFrame frame = new JFrame("Jogo de Aterrisagem de Foguete");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(larguraJanela, alturaJanela);
        frame.setResizable(false);
        frame.addKeyListener(this);
        frame.add(this);
        frame.setVisible(true);

        // Loop principal do jogo
        while (!gameOver) {
            atualizar();
            repaint();
            try {
                Thread.sleep(10); // Pequeno delay para controlar a taxa de atualização da tela
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Atualiza a posição do foguete e verifica se houve colisão
    private void atualizar() {
        posY += velocidadeY;

        // Se o foguete atingir a parte inferior da janela
        if (posY >= alturaJanela - 50) {
            gameOver = true;
        }
    }

    // Desenha o foguete na tela
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, larguraJanela, alturaJanela); // Preenche o fundo com cor preta

        // Desenha o foguete
        g.setColor(Color.RED);
        g.fillRect(posX, posY, 20, 40);

        if (gameOver) {
            g.setColor(Color.WHITE);
            g.drawString("Foguete destruído!", larguraJanela / 2 - 60, alturaJanela / 2);
        }
    }

    // Métodos da interface KeyListener
    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Tecla de seta para cima aumenta a velocidade do foguete
        if (key == KeyEvent.VK_UP) {
            velocidadeY -= 1;
        }
        // Tecla de seta para baixo diminui a velocidade do foguete
        else if (key == KeyEvent.VK_DOWN) {
            velocidadeY += 1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    // Método principal
    public static void main(String[] args) {
        new JogoAterrisagemFoguete();
    }
}
