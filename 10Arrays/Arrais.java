import java.util.Arrays;
import java.util.Scanner;

public class Arrais{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] diasUteis = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

        for(int i = 0; i < diasUteis.length; i++){System.out.println(diasUteis[i]);}
        for(int j = 0; j < diasUteis.length; j++){
            System.out.println("Hello. Digite o " + (j+1) + " primeiro elemento.");
            diasUteis[j] = scanner.nextLine();
        }
        scanner.close();

        for(int x = 0; x < diasUteis.length; x++){System.out.println(diasUteis[x]);}

        // ou

        String menuString = Arrays.toString(diasUteis);
        System.out.println(menuString);

        String[] diasSemana = new String[7];

        for(int z = 0; z < diasUteis.length; z++){
            System.out.println(diasUteis[z]);
            diasSemana[z] = diasUteis[z];
            System.out.println(diasUteis[z]);
        }
        System.out.println(Arrays.toString(diasSemana));

    }
}