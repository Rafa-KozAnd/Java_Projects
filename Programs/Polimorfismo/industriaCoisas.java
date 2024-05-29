public class industriaCoisas {
    
    public static void main(String[] args) {
        miniPc pp = new miniPc();
        soundBar ps = new soundBar();
        superServidor pss = new superServidor();

        System.out.println(pp.calculaFrete());
        System.out.println(ps.calculaFrete());
        System.out.println(pss.calculaFrete());
    }
}