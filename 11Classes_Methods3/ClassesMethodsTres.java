import java.util.Scanner;

public class ClassesMethodsTres {

     static boolean isPrime(int value) {

        if (value == 2) {
            return true;
        }

        if (value < 2 || value % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= value/2; i += 2) {
            if (value % i == 0){
                System.out.println(value + " é dívisivel por : " + i + ", logo não é primo! a");
                return false;
            }
        }
        return true; 
    }

    public static void isPrime2(int value) {

        if (value == 1)
            System.out.println(value + " é apenas dívisivel por 1 logo não é primo!");

        if (value == 2)
            System.out.println(value + " é apenas dívisivel por 1 e por sí, logo é primo!");

        if (value % 2 == 0)
            System.out.println(value + " é dívisivel por 2, logo não é primo!");

        for (int i = 3; i <= value/2; i += 2) {
            if (value % i == 0)
                System.out.println(value + " é dívisivel por : " + i + ", logo não é primo! b");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = scanner.nextInt();

        System.out.println("Você digitou o número: " + x);

        boolean priminho = isPrime(x);
        System.out.println(priminho);

        isPrime2(x);

        scanner.close();
    }
}
