import java.util.ArrayList;
import java.util.Scanner;

public class ClassesMethodsTres {

    // Classe para coletar os valores
    static class Colecta {

        ArrayList<Double> numbers;

        // Construtor da classe
        Colecta() {
            this.numbers = new ArrayList<>();
            coletarNumeros();
        }

        // Método para coletar os números
        void coletarNumeros() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite números (pressione # para terminar): ");

            // Loop para receber números do usuário
            while (true) {
                String input = scanner.next();
                if (input.equals("#")) {
                    break;  // Sai do loop se o usuário digitar #
                }

                try {
                    double num = Double.parseDouble(input);
                    numbers.add(num);  // Adiciona o número ao ArrayList
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número ou # para terminar.");
                }
            }

            // Fechando o scanner
            scanner.close();
        }

        // Método para obter os números coletados
        ArrayList<Double> getNumbers() {
            return this.numbers;
        }
    }

    // Método para calcular a soma dos números
    static double somarNumeros(ArrayList<Double> numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        // Cria uma instância da classe Colecta
        Colecta coleta = new Colecta();
        ArrayList<Double> numeros = coleta.getNumbers();
        
        // Verifica se a lista está vazia
        if (numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            // Calcula a soma dos números
            double soma = somarNumeros(numeros);
            System.out.println("Números coletados: " + numeros);
            System.out.println("A soma dos números é: " + soma);
        }


            // Definindo um array de Strings
            String[] palavras = {"Java", "Python", "JavaScript"};

            // Usando o enhanced for loop para iterar sobre o array
            for (String palavra : palavras) {
                System.out.println(palavra);
            }
        }
}