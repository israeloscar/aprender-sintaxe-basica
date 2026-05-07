import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede a temperatura e a unidade para o usuário
        System.out.print("Digite a temperatura atual: ");
        double temperatura = sc.nextDouble();

        System.out.print("Digite a unidade(C, F ou K): ");
        String unidade = sc.next();

        // Verifica a unidade e aplica as fórmulas de conversão
        if (unidade.equals("C")) {
            // Converte Celsius para Fahrenheit: (C * 9/5) + 32
            double fahrenheit = (temperatura * 9.0/5.0) + 32;
            // Converte Celsius para Kelvin: C + 273.15
            double kelvin = temperatura + 273.15;

            System.out.printf("%.2f°C = %.2f°F%n", temperatura, fahrenheit);
            System.out.printf("%.2f°C = %.2f°K%n", temperatura, kelvin);

        } else if (unidade.equals("F")) {
            // Converte Fahrenheit para Celsius: (F - 32) * 5/9
            double celsius = (temperatura - 32) * 5.0 / 9.0;
            // Converte Celsius para Kelvin para obter o valor em K
            double kelvin = celsius + 273.15;

            System.out.printf("%.2f°F = %.2f°C%n", temperatura, celsius);
            System.out.printf("%.2f°F = %.2f°K%n", temperatura, kelvin);

        } else if (unidade.equals("K")) {
            // Converte Kelvin para Celsius: K - 273.15
            double celsius = (temperatura - 273.15);
            // Converte Celsius para Fahrenheit: (C * 1.8) + 32
            double fahrenheit = (celsius * 1.8) + 32;

            System.out.printf("%.2f°K = %.2f°C%n", temperatura, celsius);
            System.out.printf("%.2f°K = %.2f°F%n", temperatura, fahrenheit);

        } else {
            // Quando a unidade não for reconhecida
            System.out.println("Unidade inválida!");
        }
    }
}