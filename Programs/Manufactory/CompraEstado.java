class CompraEstado extends Compra {

    public CompraEstado(int produto_quantidade, double produto_preco) {
        quantidade = produto_quantidade;
        preco = produto_preco;
    }

    @Override
    public void valorContabel(Conta conta) {
        conta.Valor_estoque(quantidade * preco);
        conta.Valor_forn(quantidade * preco);
    }
}