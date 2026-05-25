import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede o número limite ao usuário
        System.out.print("Digite um numero: ");
        int numero = Integer.parseInt(sc.nextLine());

        // Exibe o intervalo que será analisado
        System.out.println("Números até " + numero + ": ");

        // Loop externo — percorre cada número de 2 até N
        for (int i = 2; i <= numero; i++) {

            // Assume que o número é primo até provar o contrário
            boolean eprimo = true;

            // Loop interno — testa se algum número divide i exatamente
            for (int divisor = 2; divisor < i - 1; divisor++) {

                // Se o resto for zero, i é divisível — não é primo
                if (i % divisor == 0) {
                    eprimo = false;
                    break; // para de testar, já sabe que não é primo
                }
            }

            // Se nenhum divisor foi encontrado, o número é primo
            if (eprimo) {
                System.out.println("O número " + i + " é primo");
            }
        }

        // Fecha o Scanner ao final do programa
        sc.close();
    }
}