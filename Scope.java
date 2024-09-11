import java.util.Scanner;

public class Scope {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double length = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double width = scanner.nextDouble();

        scanner.close();
        
        calculateArea(length, width);
        calculatePerimeter(length, width);
    }

    public static void calculateArea(double param1, double param2) {
        // Local variable to store the area (accessible only within this function)
        double area = param1 * param2;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void calculatePerimeter(double param1, double param2) {
        // Local variable to store the perimeter (accessible only within this function)
        double perimeter = 2 * (param1 + param2);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
