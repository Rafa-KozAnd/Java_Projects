public class superServidor extends produto {

    public double peso = 3800;
    public double volume = 120000;
    public double preco = 30000;

    public double calculaFrete() {
        return super.calculaFrete() + (this.preco * 0.30);
    }
}