import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede o peso e a altura para o usuário
        System.out.print("Digite seu peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        // Calcula o IMC com a fórmula: peso / (altura * altura)
        double imc = peso/(altura*altura);

        // Exibe o IMC calculado com 2 casas decimais
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Saudável!");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso!");
        }
        else if (imc >= 30) {
            System.out.println("Obesidade!");
        }



    }
}
