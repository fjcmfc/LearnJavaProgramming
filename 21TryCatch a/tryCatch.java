
import java.util.Scanner;




public class TryCatch {
    public static void main(String[] args) {
        
        int a, b , c;

        Scanner SC = new Scanner(System.in);

        System.out.println("Insert two numbers, please!");

        System.out.print("Insert the first number: ");
        a = SC.nextInt();

        System.out.print("Insert the second number: ");
        b = SC.nextInt();

        try {
            c = a/ b;
            System.out.println("Division is: " + c);

        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be  iqual to 0, please try again!");

        }
        System.out.println("Thanks, bye!");
    }    
}
