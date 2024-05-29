import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o peso do usuário
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        // Solicitar a altura do usuário
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcular o IMC
        double imc = calcularIMC(peso, altura);

        // Exibir o resultado do IMC
        System.out.printf("\nSeu IMC é: %.2f\n", imc);

        // Exibir a categoria do IMC
        String categoria = classificarIMC(imc);
        System.out.println("Classificação: " + categoria);
    }

    // Método para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para classificar o IMC
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}

