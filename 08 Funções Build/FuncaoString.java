
import java.util.Scanner;

public class FuncaoString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String userInput = scanner.nextLine();
        int comprimento = (int) userInput.length();
        System.out.println("A sua string tem: " + comprimento + " caracteres.");
        System.out.println(userInput.toUpperCase());
        scanner.close();

    }
}