class Parent{

    Parent(){
        System.out.println("Non-param of parent: ");
    }
    Parent(int x){
        System.out.println("Param of parent: " + x);
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Non-param of child");
    }
    Child(int y){
        System.out.println("Param of child: " + y);
    }
    Child(int x, int y){
        super(x);
        System.out.println("2 Params of child: " + x + " / " + y);
    }
}

public class Inheritage{
    public static void main(String[] args) {

        Parent p0 = new Parent();
        System.out.println("\n\n");

        Parent p1 = new Parent(30);
        System.out.println("\n\n");

        Child c0 = new Child();
        System.out.println("\n\n");

        Child c1 = new Child(20);
        System.out.println("\n\n");

        Child c2 = new Child(20, 200);
        System.out.println("\n\n");
    }
}