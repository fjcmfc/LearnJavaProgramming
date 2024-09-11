/*
Polymorphism is a key concept in object-oriented programming (OOP) that allows objects of different classes to be treated as objects of a common superclass. It is derived from the Greek words "poly" (many) and "morph" (form), meaning "many forms.

Types of Polymorphism (Method Overloading or Method Overriding)

Method overloading - occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both)
The method that gets called is determined at compile-time based on the method signature.

Method overriding - happens when a subclass provides a specific implementation of a method that is already defined in its superclass.
The method that gets called is determined at runtime based on the object's actual type, not the reference type.
 */

class Super{
    public void display(){
        System.out.println("SUPER");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub");
    }

}

public class Overriding{
    public static void main(String[] args) {
        
        Super SUP = new Super();
        Super SUB = new Sub();

        SUP.display();
        SUB.display();

    }
}