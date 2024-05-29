import java.util.Observable;
import java.util.Observer;

public class Jogo extends Observable {

	private int versao;

	public void setNovaVersao(int novaVersao) {
		this.versao = novaVersao;

		setChanged();
		notifyObservers();
	}

	public int getVersao() {
		return this.versao;
	}

	public static void main(String[] args) {
		int novaVersao = 3;

		Jogo game = new Jogo();
		Usuario usuario = new Usuario(game);

		game.setNovaVersao(novaVersao);
	}
}

class Usuario implements Observer {

	Observable game;

	int versaoNovoJogo;

	public Usuario(Observable game) {
		this.game = game;
		game.addObserver(this);
	}

	@Override
	public void update(Observable gameSubject, Object arg1) {
		if (gameSubject instanceof Jogo) {
			Jogo game = (Jogo) gameSubject;
			versaoNovoJogo = game.getVersao();
			System.out.println("Nova versão do jogo disponível" + versaoNovoJogo);
		}
	}
}