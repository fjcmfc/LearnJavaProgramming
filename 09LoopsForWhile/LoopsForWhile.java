
public class LoopsForWhile {

    public static void main(String[] args) {

/*   &&&&&&&&&&&&& 2º bloco &&&&&&&&&&&&&&&&   */

        int x = 0, y = 1, a = 0;

        while (x != y) {

            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            ++a;

            System.out.println("O valor de x (" + x + ") é diferente de y (" + y + ").");
        }
        System.out.println("Parabéns, conseguiu que x e y fossem iguais ao fim de " + a + " vezes.");
        
/*   &&&&&&&&&&&&& 1º bloco &&&&&&&&&&&&&&&&   */

        int w = 0, z = 1, b, c;

        for (b = 1, c = 0; b <= 10; b++) {

            w = (int) (Math.random() * 10);
            z = (int) (Math.random() * 10);

            if (w == z) {
                System.out.println("O valor de x (" + w + ") é igual ao de y (" + z + ") à " + b + " tentativa.");
                c++;
            }
        }
        switch (c) {
            case 0 ->
                System.out.println("w e z nunca foram iguais ");
            case 1 ->
                System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vez.");
            default ->
                System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vezes.");

            // 1ª e 2ª forma de resolução do bloco acima é apresentado em baixo:

        /*if(c == 0){
            System.out.println("w e z nunca foram iguais ");
        }else if (c == 1) {
            System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vez.");
        } else{
            System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vezes.");
        } */

        /*switch (c) {
            case 0:
                System.out.println("w e z nunca foram iguais ");
                break;
            case 1:
                System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vez.");
                break;
            default:
                System.out.println("Parabéns, conseguiu que w e z fossem iguais " + c + " vezes.");
                break;  */
        }
        for (int j=9; j > 0; j--) {
            if (j%2 == 0) {
                continue;
            } 
            System.out.println(j);
         }
    }
}
