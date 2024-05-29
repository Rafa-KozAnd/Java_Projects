public class Conta {

    public double ICMS = 0;
    public double estoque = 0;
    public double importacao = 0;
    public double frete = 0;
    public double forn = 0;

    public void Valor_ICMS(double valor) {
        ICMS += valor;
    }

    public void Valor_estoque(double valor) {
        estoque += valor;
    }

    public void Valor_importacao(double valor) {
        importacao += valor;
    }

    public void Valor_frete(double valor) {
        frete += valor;
    }

    public void Valor_forn(double valor) {
        forn += valor;
    }
}