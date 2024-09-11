
import java.util.Scanner;

public class BuiltInFunctions {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Digite a sua frase: ");
        String comprimento = scanner.nextLine();

        int valor = comprimento.length();

        System.out.println("O comprimento da sua frase são: " + comprimento.length() + " caracteres.");

        System.out.println("O comprimento da sua frase são: " + valor + " caracteres.");
    }
}
