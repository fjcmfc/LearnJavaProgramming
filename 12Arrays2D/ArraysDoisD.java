
import java.util.Arrays;
import java.util.Scanner;

public class ArraysDoisD{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de notas a registar por aluno: ");
        int numAlunos = scanner.nextInt();
        System.out.print("Digite o número de Alunos a registar: ");
        int numNotas = scanner.nextInt();

        int[][] notas = new int[numAlunos][numNotas];
        String[] nomes = new String[numAlunos];

        scanner.nextLine();

        for (int x = 0; x < nomes.length; x++) {
            System.out.print("Escreva o nome do " + (x+1) + " aluno: ");
            nomes[x] = scanner.nextLine();
        }
        System.out.println("\n");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota da " + (j+1) + "ª disciplina do " + nomes[i] + ": ");
                notas[i][j] = scanner.nextInt();
            }
            System.out.println("\nNotas do/a aluno/a " + nomes[i] + "\t" + Arrays.toString(notas[i]) + "\n\n");
        }

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\tNotas do/a " + nomes[i] + "\t\t" + Arrays.toString(notas[i]));
        }
        System.out.println("\n\n");
    }
}