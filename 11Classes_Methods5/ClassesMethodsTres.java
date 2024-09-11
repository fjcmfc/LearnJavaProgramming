import java.util.Arrays;
import java.util.Scanner;

public class ClassesMethodsTres {

        //Great common divisor
     static int majorNumber(int numbers[]) {

        int major = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > major){
                major = numbers[i];
            }
        }
        System.out.println("\nInteiros - O maior número no Array é: " + major);
        return major;
    }

    static double majorNumber(double numbers[]) {

        double major = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > major){
                major = numbers[i];
            }
        }
        System.out.println("\nDoubles - O maior número no Array é: " + major);
        return major;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário se ele quer inserir inteiros ou doubles
        System.out.print("Você quer inserir números inteiros (i) ou decimais (d)? ");
        char choice = scanner.next().charAt(0);

        System.out.print("Digite o número de números a digitar: ");
        int x = scanner.nextInt();

        int[] intNumbers = new int[x];
        double[] doubleNumbers = new double[x];

        if(choice == 'i'){
            for (int i = 0; i < x; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                intNumbers[i] = scanner.nextInt();
            }
            System.out.println("\nO maior número no Array é: " + majorNumber(intNumbers));
            System.out.println("\n" + Arrays.toString(intNumbers));
        }else{
            for (int i = 0; i < x; i++) {
                System.out.print("Digite o " + (i+1) + "º número: ");
                doubleNumbers[i] = scanner.nextDouble();
            }
            System.out.println("\n" + Arrays.toString(doubleNumbers));
            System.out.println("\nO maior número no Array é: " + majorNumber(doubleNumbers));
        }

        scanner.close();
    }
}
