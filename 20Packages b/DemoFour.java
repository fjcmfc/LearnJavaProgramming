
package mypack2;

import mypack1.DemoOne;

public class DemoFour extends DemoOne {
    DemoOne d4 = new DemoOne();

    public void show1(){
        System.out.println(d4.a + d4.b + d4.c + d4.d);
    }
    public void show2(){
        System.out.println(a + b + c + d);
    }
}