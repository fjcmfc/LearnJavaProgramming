
import java.util.Scanner;

public class Chatbot{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. What is your name?");

        String nome = scanner.nextLine();

        System.out.println("Hi " + nome + "! " + "My name is javabot. Where are you from?");

        String local = scanner.nextLine();

        System.out.println("I hear the it's beautiful there in " + local + "! I'm from OracleLandia");
        System.out.println("How old are you");

        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("So you are " + idade + ". Coll! I'm 400 years old");
        System.out.println("This means I'm " + (400/idade) + " times older than you!");

        System.out.println("What is your prefered programing language?");
        String linguagem = scanner.nextLine();

        if(linguagem.equals("Java"))
        {System.out.println(linguagem + " Great!!! You are a king of mine ;) love you! I have to angup now, thanks!");}
        else
        {System.out.println("Ok, by");}

        scanner.close();



    }
}