
public class ClassesMethodsTres {

        //Great common divisor
    static void show(int ...A) {

            for(int x:A){
                System.out.println(x);
            }

    }
    public static void main(String[] args) {

        show();
        show(10, 20, 30, 40);
        show(new int[]{11,22,33,44,55,66});
    }
}