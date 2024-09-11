
class Circle {

    /*
    Ao colocar as pripriedades do objecto da class estamos a proteger os seus dados
    Este processo é depois usado com os Getters e Setters por forma a consultar e 
    alterar essas propriedades sempre que necessário.
     */
    private double radius;

    // Constructors +++++++++++++

    // Construtor com atribuição de valor de propriedade.
    public Circle(){
        radius = 1;
    }

    /*
    Em baixo estão dois exemplos de construtores
    EX.: 1 - Atribuição directa 
    O valor do parâmetro r é passado para o método setRadius, que então faz
    a atribuição ao atributo radius. Essa abordagem permite que você inclua
    lógica adicional no método setRadius, como validação do valor ou outros
    efeitos colaterais.
    */
    public Circle(double r){
        setRadius(r);
    }

    /*
    EX.: 1 - Atribuição 
    Neste caso, o valor do parâmetro radius é atribuído diretamente ao atributo
    radius da classe. Isso é simples e direto, mas não permite adicionar lógica
    adicional, como validação ou manipulação do valor antes da atribuição.
    
    public Circle(double radius) {
        this.radius = radius;
    }
    */
    // Constructors --------------
    


    // Getters and Setters
    public void setRadius(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }

    // Methods
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
        if (h >= 0) {
            heigth = h;
        } else {
            heigth = 0;
        }
    }
    public void setWidth(double w) {
        if (w >= 0) {
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

    //Constructors
    public Rectangle(){
        heigth = 2;
        width = 2;
    }
    public Rectangle(double h, double w){
        setHeigth(h);
        setWidth(w);
    }
    public Rectangle(double s){
        heigth = width = s;
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

    //Constructors
    public Cilinder() {
        this.radius = 3;
        this.heigth = 13; 
    }
    public Cilinder(double r) {
        this.radius = r;
        this.heigth = 13;
    }
    public Cilinder(double radius, double heigth) {
        this.radius = radius;
        this.heigth = heigth;
    }

    //Setters and Getters
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

    // Methods
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

public class Constructors {

    public static void main(String[] args) {

        //Circle data *****************************************
        Circle c1 = new Circle();
        Circle c2 = new Circle(10.6);
        
        /*
        Property not needeed:

            c1.setRadius(8);

        Because is defined with the circles creation and after the
        constructors create the objects with the appropriate dimensions.
        */

        System.out.println("\n" + c1);
        System.out.println("\nArea: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());

        System.out.println("\n" + c2);
        System.out.println("\nArea: " + c2.area());
        System.out.println("Perimeter: " + c2.perimeter());

        //Rectangle data *****************************************
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,3);
        Rectangle r3 = new Rectangle(4);

        /*
        Properties not needeed:

            r1.setHeigth(10.5);
            r1.setWidth(5.5); 

        Because are defined with the objects rectangles creation and after
        the constructors create the objects with the appropriate dimensions.
        */

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

        //Cilinder data *****************************************
        Cilinder cl1 = new Cilinder();
        Cilinder cl2 = new Cilinder(5);
        Cilinder cl3 = new Cilinder(5,13);

        /*
        cl1.setRadius(7);
        cl1.setHeigth(10);
        */

        System.out.println("\n" + cl1);
        System.out.println("\nThe area of the cylinder's base is: " + cl1.circleArea());
        System.out.println("The cilinder lateral area is: " + cl1.lateralArea());
        System.out.println("The cilinder total area is: " + cl1.totalArea());
        System.out.println("The cilinder volume is: " + cl1.volume());

        System.out.println("\n" + cl2);
        System.out.println("\nThe area of the cylinder's base is: " + cl2.circleArea());
        System.out.println("The cilinder lateral area is: " + cl2.lateralArea());
        System.out.println("The cilinder total area is: " + cl2.totalArea());
        System.out.println("The cilinder volume is: " + cl2.volume());

        System.out.println("\n" + cl3);
        System.out.println("\nThe area of the cylinder's base is: " + cl3.circleArea());
        System.out.println("The cilinder lateral area is: " + cl3.lateralArea());
        System.out.println("The cilinder total area is: " + cl3.totalArea());
        System.out.println("The cilinder volume is: " + cl3.volume());

        System.out.println("");
    }
}
