import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PongGame extends JPanel implements ActionListener {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int BALL_SIZE = 20;
    private static final int PADDLE_WIDTH = 10;
    private static final int PADDLE_HEIGHT = 100;
    private static final int PADDLE_SPEED = 5;

    private int ballX, ballY, ballXDir, ballYDir;
    private int player1Y, player2Y;
    private Timer timer;

    public PongGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(new KeyHandler());
        initializeGame();
    }

    private void initializeGame() {
        ballX = WIDTH / 2 - BALL_SIZE / 2;
        ballY = HEIGHT / 2 - BALL_SIZE / 2;
        ballXDir = -2;
        ballYDir = 2;
        player1Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
        player2Y = HEIGHT / 2 - PADDLE_HEIGHT / 2;
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha a bola
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

        // Desenha as raquetes dos jogadores
        g.fillRect(10, player1Y, PADDLE_WIDTH, PADDLE_HEIGHT);
        g.fillRect(WIDTH - 20, player2Y, PADDLE_WIDTH, PADDLE_HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBall();
        checkCollision();
        repaint();
    }

    private void moveBall() {
        ballX += ballXDir;
        ballY += ballYDir;
    }

    private void checkCollision() {
        // Verifica colisão com as paredes superior e inferior
        if (ballY <= 0 || ballY >= HEIGHT - BALL_SIZE) {
            ballYDir = -ballYDir;
        }

        // Verifica colisão com as raquetes
        if (ballX <= 20 && ballY + BALL_SIZE >= player1Y && ballY <= player1Y + PADDLE_HEIGHT) {
            ballXDir = -ballXDir;
        }
        if (ballX >= WIDTH - 30 && ballY + BALL_SIZE >= player2Y && ballY <= player2Y + PADDLE_HEIGHT) {
            ballXDir = -ballXDir;
        }

        // Verifica se a bola saiu da tela
        if (ballX <= 0 || ballX >= WIDTH - BALL_SIZE) {
            initializeGame();  // Reinicia o jogo se a bola sair da tela
        }
    }

    private class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            // Controles do jogador 1 (W e S)
            if (key == KeyEvent.VK_W && player1Y > 0) {
                player1Y -= PADDLE_SPEED;
            }
            if (key == KeyEvent.VK_S && player1Y < HEIGHT - PADDLE_HEIGHT) {
                player1Y += PADDLE_SPEED;
            }

            // Controles do jogador 2 (Up e Down)
            if (key == KeyEvent.VK_UP && player2Y > 0) {
                player2Y -= PADDLE_SPEED;
            }
            if (key == KeyEvent.VK_DOWN && player2Y < HEIGHT - PADDLE_HEIGHT) {
                player2Y += PADDLE_SPEED;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong Game");
        PongGame gamePanel = new PongGame();
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
