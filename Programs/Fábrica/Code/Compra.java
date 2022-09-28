abstract class Compra {
    
    public Produto produto = new Produto();
    public int quantidade = 0;
    public double preco = 0.0;

    public abstract void valorContabel(Conta conta);
}