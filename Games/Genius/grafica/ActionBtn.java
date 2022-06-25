package grafica;

// Imports
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

// Chamados de classe
import logica.MemoriaGenius;
import logica.MemoriaGenius.Cores;


public class ActionBtn extends AbstractAction {
    // Variáveis
    private Cores cor;
    private MemoriaGenius logicaGenius;

    public ActionBtn(Cores cor, MemoriaGenius logGenius) {
        this.cor = cor;
        this.logicaGenius = logGenius;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        logicaGenius.lerCorJogador(cor);
    }
}
