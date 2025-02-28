abstract class Super{
    public Super(){
        System.out.println("Super constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
    
}

class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("Sub meth2");
    }
}


public class AbstractClasses{
    public static void main(String[] args) {
        
        //Super s = new Super;  --> Super is abstract, cannot be instantiated
        
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }

}