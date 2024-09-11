/*
Polymorphism is a key concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. It is derived from the Greek words "poly" (many) and "morph" (form), meaning "many forms.

Types of Polymorphism (Method Overloading or Method Overriding)

Method overloading - occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both)
The method that gets called is determined at compile-time based on the method signature.

Method overriding - happens when a subclass provides a specific implementation of a method that is already defined in its superclass.
The method that gets called is determined at runtime based on the object's actual type, not the reference type.
 */

class Test{

    public int max(int a, int b){

        return a>b?a:b;

    }
    public int max(int a, int b, int c){
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

public class Overloading{
    public static void main(String[] args) {
        
        Test m = new Test();

        int maximo; 
        maximo = m.max(10, 12);

        System.out.println(m);
        System.out.println(maximo);
        System.out.println(m.max(2, 4));
        System.out.println(m.max(3, 1));
        System.out.println(m.max(3 , 5, 1));
    }
}