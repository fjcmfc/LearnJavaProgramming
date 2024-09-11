import java.util.Arrays;

public class ClassesMethods {

    //Primeira fase do execicio (Isto é um método)
    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    //Segunda fase do execicio
    static void update(int A[]) {
        A[0]=25;
    }


    //Terceira fase do execicio

    static String username(String email){
        int a = email.indexOf('@');
        String name = email.substring(0, a);
        return name;
    }

    static String domain(String email){
        int atIndex = email.indexOf('@');
        String domain = email.substring(atIndex + 1);
        return domain;
    }

    public static void main(String[] args) {

        int a = 10, b = 15, c;

        max(a, b);

        //Primeira fase do execicio (Chamada ao método)
        c = max(a, b);

        System.out.println(c);

        //Segunda fase do execicio

        int A[] = {2 ,3 ,4 ,5 ,6};

        System.out.println(Arrays.toString(A));
        update(A);
        System.out.println(Arrays.toString(A));

        
        System.out.println(username("fre.carv@teste.com"));
        System.out.println("www." + domain("fre.carv@teste.com"));
    }
}
