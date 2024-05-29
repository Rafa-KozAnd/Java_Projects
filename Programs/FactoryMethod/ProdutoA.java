public class ProdutoA implements Produto {
    
    private double preco = 300.12;
    private String cor = "preto";
    private boolean estado = true; // Ativado = true | Desligado = false.

    public void setPreco(double preco) {
        this.preco = preco;
    }    

    public void Acionar() {

        if(estado == true) {
            System.out.println("Ativado");
        } else {
            System.out.println("Desativado");
        }
    }
}
