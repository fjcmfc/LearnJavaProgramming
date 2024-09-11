
public class Teste {

    public static void main(String[] args) {

        System.out.println("testes");

        boolean vf = true;
        int i = 0;

        System.out.println("O valor de vf é " + vf);

        while (vf) {
            System.out.println("i is: " + i);
            i++;

            if(i == 5){
                vf = false;
                System.out.println("vf é " + vf);
            } else{
                System.out.println("vf é " + vf);
            }
        }

        System.out.println("*******************");
        i = 0;

        vf = true;

        do {
            System.out.println("i is: " + i);
            i++;

            if(i == 5){
                vf = false;
                System.out.println("vf é " + vf);
            } else{
                System.out.println("vf é " + vf);
            }
        } while (vf);


    }
}
