import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Pede a nota para o usuário
    System.out.print("Digite a nota: ");
    double nota = Double.parseDouble(sc.nextLine());

    // Verifica se a nota é válida e classifica o aluno
    if  (nota >= 7 && nota <= 10) {
        // Nota entre 7 e 10 = aluno aprovado
        System.out.println("Aprovado!");
        }
    else if (nota >= 5 && nota < 7) {
        // Nota entre 5 e 6.9 = aluno em recuperação
        System.out.println("Recuperação!");
    }
    else if (nota < 0 || nota > 10) {
        // Nota fora do intervalo 0-10 = entrada inválida
        System.out.println("Nota inválida!");
    }
    else {
        // Qualquer valor abaixo de 5 — aluno reprovado
        System.out.println("Reprovado!");
    }
    sc.close();


    }
}