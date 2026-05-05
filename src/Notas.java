import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a nota: ");
    double nota = Double.parseDouble(sc.nextLine());

    if  (nota >= 7 && nota <= 10) {
        System.out.println("Aprovado!");
        }
    else if (nota >= 5 && nota < 7) {
        System.out.println("Recuperação!");
    }
    else if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida!");
    }
    else {
        System.out.println("Reprovado!");
    }


    }
}