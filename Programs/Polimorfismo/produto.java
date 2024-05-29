public class produto {

    public double peso;     // Massa do produto embalado em gramas.
    public double volume;   // Em cm3.
    public double preco;    // Preço de comercialização.

    public double calculaFrete() {
        return ((this.peso / 1000) * 0.80) + ((this.volume * 0.000001));
    }
}