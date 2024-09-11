//Overcoming Single Inheritance Limitation: In Java, a class can inherit from only one superclass (single inheritance). However, a class can implement multiple interfaces. This allows a class to inherit behaviors from multiple sources, achieving a form of multiple inheritance without the complexities associated with it.

interface Test{
    void meth1();
    void meth2();
}
class MyInterface implements Test{
    @Override
    public void meth1(){
        System.out.println("Meth1 of class MyInterface");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 of class MyInterface");
    }
    public void meth3(){
        System.out.println("Meth3 of class MyInterface");
    }
}

public class Interfaces{
    public static void main(String[] args) {
        
        Test interf = new MyInterface();
        interf.meth1();
        interf.meth2();
        //interf.meth3(); Neste caso termos um erro invocar o meth3 apenas é possivel usando o próximo exemplo

        MyInterface MyInterf = new MyInterface();
        MyInterf.meth1();
        MyInterf.meth2();
        MyInterf.meth3();

    }
}