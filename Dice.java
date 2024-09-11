
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean valido = false;

        System.out.print("Digite um número inteiro, entre 0 e 10: ");
        while(scanner.hasNextInt())
        do{
            int numb1 = scanner.nextInt();
            valido = (numb1 >= 0 && numb1 <= 10 && numb1.());

            if(!valido){
                System.out.println("O número não é válido! Tente novamente");
            }
        
        } while (!valido);
            System.out.println("O número é válido!");


        System.out.print("\nDigite o 2º valor, entre 0 e 10: ");
        int numb2 = scanner.nextInt();

        System.out.print("\nDigite o 3º valor, entre 0 e 10: ");
        int numb3 = scanner.nextInt(); 

        scanner.close();

        for(int x = 0; x < 3; ++x){

            int numero =  (int) (Math.random()*10);
            System.out.println("O " + (x+1) + " número é: " + numero);
        }
        scanner.close();
    }
}

