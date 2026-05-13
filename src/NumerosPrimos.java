import java.util.Scanner;


public class NumerosPrimos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pede o número para analisar
    System.out.print("Digite um numero: ");
    int numero = Integer.parseInt(sc.nextLine());

    // Print mostrando todos os números até o número analisado
    System.out.println("Números até " + numero + ": ");

    // Loop para identificar quais números até o número analisado é primo
    for (int i = 2; i <= numero; i++ ) {
        boolean eprimo = true;
        for (int divisor = 2; divisor < i - 1;  divisor++) {
            if (i % divisor == 0) {
                eprimo = false;
                break;
            }
        }
        if (eprimo) {
            System.out.println("O número " + i + " é primo");
        }
        }

    sc.close();


    }
}
