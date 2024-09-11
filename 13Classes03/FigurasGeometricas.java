
class Circle {

    private double radius;

    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle data - Radius: " + radius;
    }
}

class Rectangle {

    //Properties
    private double heigth;
    private double width;

    //Properties methods - Setters
    public void setHeigth(double h) {
        if (heigth >= 0) {
            heigth = h;
        } else {
            heigth = 0;
        }
    }
    public void setWidth(double w) {
        if (width >= 0) {
            width = w;
        } else {
            width = 0;
        }
    }

    //Properties methods - Getters
    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    //Methods
    public double area() {
        return heigth * width;
    }

    public double perimeter() {
        return 2 * (heigth + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(heigth, 2) + Math.pow(width, 2));
    }

    public boolean isSquare() {
        return heigth == width;
    }

    public String toString() {
        return "Rectangle data - Heigth: " + heigth + " / Width: " + width;
    }
}

class Cilinder {

    private double radius;
    private double heigth;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double h) {
        heigth = h;
    }


    public double circleArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double lateralArea() {
        return (2 * Math.PI * radius * heigth);
    }

    public double totalArea() {
        return (2 * (Math.PI * Math.pow(radius, 2)) + 2 * (Math.PI * radius * heigth));
    }

    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * heigth);
    }

    public String toString() {
        return "Cilinder data - Radius: " + radius + " / Heigth: " + heigth;
    }
}

public class FigurasGeometricas {

    public static void main(String[] args) {

        //Circle data
        Circle c1 = new Circle();
        c1.setRadius(8);
        System.out.println("\n" + c1);
        System.out.println("\nArea: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());

        //Rectangle data
        Rectangle r1 = new Rectangle();
        r1.setHeigth(10.5);
        r1.setWidth(5.5);

        System.out.println("\n" + r1);
        System.out.println("\nArea: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Diagonal: " + r1.diagonal());

        if (r1.isSquare()) {
            System.out.println("The polygon is a square!");
        } else {
            System.out.println("The polygon is a rectangle!");
        }

        System.out.println("\nRectangle data - Heigth: " + r1.getHeigth() + " / Width: " + r1.getWidth());

        //Cilinder data
        Cilinder cl1 = new Cilinder();

        cl1.setRadius(7);
        cl1.setHeigth(10);

        System.out.println("\n" + cl1);
        System.out.println("\nThe area of the cylinder's base is: " + cl1.circleArea());
        System.out.println("The cilinder lateral area is: " + cl1.lateralArea());
        System.out.println("The cilinder total area is: " + cl1.totalArea());
        System.out.println("The cilinder volume is: " + cl1.volume());

        System.out.println("");
    }
}
