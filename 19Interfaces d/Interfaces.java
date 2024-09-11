
interface test1 {

    //All variables must be designated by upercase letters, ex: 
    final static int X = 10;
    //All variables are also static and final

    //All methods are public and abstract 
    public abstract void meth1();
    public abstract void meth2();

    //Interfaces can have stat ic methods with body, ex:
    public static void meth3() {
        System.out.println("Public static method of interface test");
    }
}

interface test2 extends test1{
    void meth4();
}

class My implements test2{
    @Override
    public void meth1(){}
    @Override
    public void meth2(){}

    public void meth3(){}
    @Override
    public void meth4(){}
}

public class Interfaces {

    public static void main(String[] args) {

        System.out.println(test1.X);
        test1.meth3();

        My m = new My();
        m.meth1();
        m.meth2();
        m.meth3();
        m.meth4();


    }
}
