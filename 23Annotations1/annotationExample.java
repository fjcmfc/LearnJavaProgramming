import java.util.Scanner;

public class annotationExample {

    public static void main(String[] args){

        //int idadeInes, idadeDiana;

        // Criar um objeto Scanner para receber input do utilizador
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao utilizador que insira um número inteiro
        System.out.print("Digite o primeiro número: ");

        // Ler o número inteiro usando o método nextInt() do Scanner
        int idadeInes = scanner.nextInt();

        System.out.print("Digite o segundo número: ");

        // Ler o número inteiro usando o método nextInt() do Scanner
        int idadeDiana = scanner.nextInt();

        int somaIdades = idadeDiana * idadeInes;

        // Exibir o número inserido pelo utilizador
        System.out.println("A soma dos dois números é: " + somaIdades);

        // Fechar o scanner
        scanner.close();
    }
}