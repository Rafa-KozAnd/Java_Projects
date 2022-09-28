import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("\n\nProva -> Padrões de Projetos.");

        boolean opc = true;

        while (opc != false){
            System.out.println("\n##### Fábrica: #####");
            System.out.println("\n[1] - Compra Estadual.");
            System.out.println("\n[2] - Compra Nacional.");
            System.out.println("\n[3] - Compra Internacional.");
            System.out.println("\n[4] - Finalizar sessão.");
            System.out.println("\nOpção: \n");
            
            int opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n-> Produto Estadual: ");
                    System.out.println("\nEntre com a quantidade: ");
                    int quantidadeEstadual = ler.nextInt();
                    System.out.println("\nEntre com o preço:");
                    double precoEstadual = ler.nextDouble();
                    CompraEstado compraEstado = new CompraEstado(quantidadeEstadual, precoEstadual);
                    compraEstado.valorContabel(conta);
                    break;
                case 2:
                    System.out.println("\n-> Produto Nacional: ");
                    System.out.println("\nEntre com a quantidade: ");
                    int quantidadeNacional = ler.nextInt();
                    System.out.println("\nEntre com o preço:");
                    double precoNacional = ler.nextDouble();
                    CompraNacional compraNacional = new CompraNacional(quantidadeNacional, precoNacional);
                    compraNacional.valorContabel(conta);
                    break;
                case 3:
                    System.out.println("\n-> Produto Internacional: ");
                    System.out.println("\nEntre com a quantidade: ");
                    int quantidadeInternacional = ler.nextInt();
                    System.out.println("\nEntre com o preço:");
                    double precoInternacional = ler.nextDouble();
                    CompraInternacional compraInternacional = new CompraInternacional(quantidadeInternacional, precoInternacional);
                    compraInternacional.valorContabel(conta);
                    break;
                case 4:
                    opc = false;
                    System.out.println("\nSessão Finalizada!\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }

            System.out.println(" ____________________________");
            System.out.println("| Estoque:          " + conta.estoque);
            System.out.println("| Frete:            " + conta.frete);
            System.out.println("| ICMS:             " + conta.ICMS);
            System.out.println("| Fornecimento:     " + conta.forn);
            System.out.println("| Importação:       " + conta.importacao);
            System.out.println("|____________________________");
            System.out.println("\n\n");

        }
    }
}
