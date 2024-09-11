import java.util.Scanner;

public class ClassesMethodsTres {

        //Great common divisor
     static void gcd(int n, int m) {

        do{
            if (n > m){
                n = n - m;
                System.out.println("n é: " + n);
            }
            else if (m > n){
                m = m - n;
                System.out.println("m é: " + m);
            } 
            if(n == m) System.out.print("\nO maior divisor comum é o número: " + n);

        }while(n != m);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int x = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int y = scanner.nextInt();

        gcd(x, y);

        scanner.close();
    }
}
