import java.util.Scanner;

class CompraInternacional extends Compra {

    Scanner ler = new Scanner(System.in);
    
    public CompraInternacional(int produto_quantidade, double produto_preco) {
        quantidade = produto_quantidade;
        preco = produto_preco;
    }

    @Override
    public void valorContabel(Conta conta) {
        conta.Valor_estoque(quantidade * preco);
        conta.Valor_forn(quantidade * preco);

        System.out.println("Entre com o valor da importação: ");
        double entrada_importacao = ler.nextDouble();
        conta.Valor_importacao(entrada_importacao);
    }
}
