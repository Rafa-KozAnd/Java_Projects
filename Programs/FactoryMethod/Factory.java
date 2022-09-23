public class Factory {

    public Produto getProduto(String opc) {

        if(opc.equals("A"))
            return new ProdutoA();
            
        if(opc.equals("B"))
            return new ProdutoB();

        return null;
    }
}
