
class Rectangle{

    int length;
    int breadth;
    int x = 15;

    //Constructors
    Rectangle(){
        length = breadth = 3;
    }
    Rectangle(int b, int l){
        this.breadth = b;
        this.length = l;
    }
    //Methods
    int area(){
        return 2 * length + 2 * breadth;
    }
    public void Display(){
        System.out.println("Hello - Rectangle");
    }

}

class Cube extends Rectangle{

    int height = 4;
    int x = 30;

    //Constructors
    Cube(){
        height = 3;
    }
    Cube(int h){
        this.height = h;
    }
    Cube(int l, int b, int h){
        super(l, b);
        this.height = h;
    }

    //Methods
    int volume(){
        return this.breadth * this.length * this.height;
    }
    int volume3(){
        int volume = this.breadth * this.length * this.height;
        System.out.println(volume);
        return this.breadth * this.length * this.height;
    }
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }

    @Override
    public void Display(){
        System.out.println("Hello Welcome - Cube");
    }
}


public class Inheritage{
    public static void main(String[] args) {
        
        Cube c1 = new Cube();
        System.out.println(c1);
        System.out.println(c1.volume());

        c1.volume3();

        Cube c2 = new Cube(5);
        System.out.println(c2);
        System.out.println(c2.volume());

        Cube c3 = new Cube(5, 8, 10);
        System.out.println(c3);
        System.out.println(c3.volume());

        Cube c4 = new Cube(1, 2, 7);
        System.out.println(c4);
        System.out.println(c4.volume3());

        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println(r1.area());

        System.out.println("*************");
        c1.display();
        System.out.println("*************");

        //Method Overriding
        r1.Display();
        System.out.println("*************");
        c1.Display();

        System.out.println("***************");
        Rectangle sup = new Cube();
        sup.Display();
        System.out.println("***************");
        Rectangle sub = new Rectangle();
        sub.Display();


        //Cube c3 = new Cube(3, 4);
        //Cube c4 = new Cube(5, 5, 5);
    }
}