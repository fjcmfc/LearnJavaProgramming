



abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}


class Circle extends Shape{
    double radius;

    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}

class Rectangle extends Shape{
    double height;
    double width;

    @Override
    public double perimeter(){
        return 2 * (height + width);
    }
    @Override
    public double area(){
        return height * width;
    }

}

public class AbsClassesExample {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.radius = 4;
        System.out.println(c.area());
        System.out.println(c.perimeter());
        
        Rectangle r = new Rectangle();
        r.height = 4;
        r.width = 2;

        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
