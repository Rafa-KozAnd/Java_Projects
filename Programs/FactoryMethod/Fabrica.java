public class Fabrica {
    public static void main(String[] args) {

        Factory factory = new Factory();

        Produto ProdutoA = factory.getProduto("A");
        Produto ProdutoB = factory.getProduto("B");

        System.out.println("-> Produto A:");
        ProdutoA.Acionar();

        System.out.println("-> Produto B:");
        ProdutoB.Acionar();
        
        System.out.println("-> Produto B Alterado:");
        ProdutoB.setPreco(10.00);
        ProdutoB.Acionar();
    }
}
