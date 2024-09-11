
class GeometricFigures {

}

class GeometricFigures2D extends GeometricFigures {

}

class Polygonal2D extends GeometricFigures2D {

    //Properties
    protected double width;
    protected double height;
    protected int sides;

    //Constructor
    public Polygonal2D(double w, double h, int s) {
        this.width = w;
        this.height = h;
        this.sides = s;
    }

    //Setters and Getters
    public double getWidth() {
        return width;
    }

    public void setWigth(double h) {
        if (h >= 0) {
            this.width = h;
        } else {
            this.width = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeigth(double h) {
        if (h >= 0) {
            this.height = h;
        } else {
            this.height = 0;
        }
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int s) {
        this.sides = s;
    }

    //Method to calculate the internal angle of the polygon
    public double calculateInternalAngle() {
        if (sides < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 sides.");
        }
        return ((sides - 2) * 180.0) / sides;
    }
}

class NonPolygonal2D extends GeometricFigures2D {

}

class GeometricFigures3D extends GeometricFigures {

}

class Polyhedral3D extends GeometricFigures3D {

}

class NonPolyhedral3D extends GeometricFigures3D {

}

class Triangle extends Polygonal2D {

    private double side1;
    private double side2;
    private double side3;

    //Constructor
    public Triangle(double width, double height, int sides, double side1, double side2, double side3) {
        super(width, height, 3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Methods
    public double calculateArea() {
        return 0.5 * this.width * this.height;
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle extends Polygonal2D {

    //Constructors
    public Rectangle(double width, double height, int sides) {
        super(width, height, sides);
    }

    //Methods
    public double calculateArea() {
        return this.width * this.height;
    }

    public double perimeter() {
        return 2 * (this.height + this.width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }

    public boolean isSquare() {
        return this.height == this.width;
    }

    public String toString() {
        return "Rectangle data - Heigth: " + this.height + " / Width: " + this.width + " / Sides: " + this.sides;
    }
}

public class Inheritage {

    public static void main(String[] args) {

        // Creating a Triangle instance
        Triangle triangle = new Triangle(10, 5, 3, 7, 8, 9);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        // Creating a Rectangle instance
        Rectangle rectangle = new Rectangle(10, 5, 4);
        System.out.println("\nRectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
        System.out.println("Rectangle diagonal: " + rectangle.diagonal());
        System.out.println("Is Rectangle a square? " + rectangle.isSquare());

        System.out.println("Internal angle degrees is: " + triangle.calculateInternalAngle() + "Degrees");
        System.out.println("Internal angle degrees is: " + rectangle.calculateInternalAngle() + "Degrees");

        /*
        //Rectangle data *****************************************
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 3);
        Rectangle r3 = new Rectangle(4);

        //******** Data: Rectangule 1 ****************************
        System.out.println("\n" + r1);
        System.out.println("\nArea: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Diagonal: " + r1.diagonal());

        if (r1.isSquare()) {
            System.out.println("The polygon is a square!");
        } else {
            System.out.println("The polygon is a rectangle!");
        }

        //******** Data: Rectangule 2 ****************************
        System.out.println("\n" + r2);
        System.out.println("\nArea: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());
        System.out.println("Diagonal: " + r2.diagonal());

        if (r2.isSquare()) {
            System.out.println("The polygon is a square!");
        } else {
            System.out.println("The polygon is a rectangle!");
        }

        //******** Data: Rectangule 3 ****************************
        System.out.println("\n" + r3);
        System.out.println("\nArea: " + r3.area());
        System.out.println("Perimeter: " + r3.perimeter());
        System.out.println("Diagonal: " + r3.diagonal());

        if (r3.isSquare()) {
            System.out.println("The polygon is a square!");
        } else {
            System.out.println("The polygon is a rectangle!");
        }

        //************************************
        System.out.println("\nRectangle data - Heigth: " + r1.getHeigth() + " / Width: " + r1.getWidth());

         */
        System.out.println("");
    }
}
