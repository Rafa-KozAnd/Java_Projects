import java.util.Scanner;

class CompraNacional extends Compra {

    Scanner ler = new Scanner(System.in);
    
    public CompraNacional(int produto_quantidade, double produto_preco) {
        quantidade = produto_quantidade;
        preco = produto_preco;
    }
    
    @Override
    public void valorContabel(Conta conta) {

        conta.Valor_estoque(quantidade * preco);
        conta.Valor_forn(quantidade * preco);

        System.out.println("Entre com o valor do frete: ");
        double entrada_frete = ler.nextDouble();
        conta.Valor_frete(entrada_frete);

        System.out.println("Entre com a porcentagem do ICMS: ");
        double entrada_ICMS = ler.nextDouble();
        double novo_ICMS = (quantidade * preco) * (entrada_ICMS / 100);

        System.out.println("Entre com o valor do ISS de frete: ");
        double entrada_issFrete = ler.nextDouble();
        conta.Valor_ICMS(novo_ICMS + entrada_frete - entrada_issFrete);
    }
}