
import mypack1.packagesB;
import mypack1.packagesC;
import mypack1.inner.packagesD;

class packagesAll {
    public static void main(String[] args) {
        packagesA p1 = new packagesA();
        p1.display();
        packagesB p2 = new packagesB();
        p2.display();
        packagesC p3 = new packagesC();
        p3.display();
        packagesD p4 = new packagesD();
        p4.display();
    }
}