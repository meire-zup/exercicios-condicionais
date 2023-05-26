import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Responda as perguntas a seguir com 1 para sim e 0 para não:");
        System.out.println("Telefonou para a vítima?");
        int pergunta1 = scanner.nextInt();
        System.out.println("Esteve no local do crime?");
        int pergunta2 = scanner.nextInt();
        System.out.println("Mora perto da vítima");
        int pergunta3 = scanner.nextInt();
        System.out.println("Devia para a vítima?");
        int pergunta4 = scanner.nextInt();
        System.out.println("Já trabalhou com a vítima?");
        int pergunta5 = scanner.nextInt();

        int respostas = (pergunta1 + pergunta2 + pergunta3 + pergunta4 + pergunta5);
        if (respostas < 2) {
            System.out.println("Classificação no crime: INOCENTE");
        } else if (respostas == 2) {
            System.out.println("Classificação no crime: SUSPEITO");
        } else if (respostas < 5) {
            System.out.println("Classificação no crime: CÚMPLICE");
        } else {
            System.out.println("Classificação no crime: ASSASSINO");
        }
    }
}

