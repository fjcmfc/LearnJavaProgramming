import java.util.Scanner;

public class FuncaoMatematica {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int userInput = scanner.nextInt();
        double aoQuadrado = Math.pow(userInput, 2);
        System.out.println("O seu número elevado ao quadrado é: " + aoQuadrado);
        scanner.close();
    }
}
