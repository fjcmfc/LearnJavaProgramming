
import java.util.Scanner;

public class Chorus {

    public static void calculateArea(double length, double width){
        double area = length * width;
        System.out.println("A área do rectangulo é : " + area);
    }

    public static void singChorus(){
        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Don't blame it on the boogie\n");
    }
    public static void bartHomeWorkfunc() {
        System.out.println("I will not copy and paste code.");
        System.out.println("I will use lower Camel Case when writing variables names.\n");
        }
    public static void main(String[] args) {
        // Chorus needs to be sung 5 times

        singChorus();

        bartHomeWorkfunc();

        BartHomeWork.bartHomeWorkIntro();

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double width = scan.nextDouble();

        System.out.print("Digite o segundo número: ");

        double length = scan.nextDouble();

        scan.close();

        calculateArea(length, width);

        double area = ReturnValues.calculateArea2(length, width);

        System.out.println("A área do rectangulo é: " + area);

    }
}