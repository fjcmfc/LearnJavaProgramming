
import java.util.Arrays;

public class ClassesMethodsDois {
    
    static void change(int X[], int index, int value) {
        X[index]=value;
    }

    public static void main(String[] args) {
    
        int A[] = {2,4,6,8,10};

        change(A,2,20);

        System.out.println(Arrays.toString(A));
    }
}
