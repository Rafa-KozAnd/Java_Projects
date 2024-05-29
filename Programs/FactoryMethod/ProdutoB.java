public class ProdutoB implements Produto {
    
    private double preco = 0.99;
    private double tamanho = 100.30;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Acionar() {
        System.out.println("ProdutoB - Preço: " + preco);
        System.out.println("ProdutoB - Tamanho: " + tamanho);
    }
}
