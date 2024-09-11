
import java.util.Scanner;

public class ArraysTicTacToe {

    public static void main(String[] args) {

        //Declaração das variaveis
        String[][] quadro = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        int coluna, linha;
        String jogador;
        boolean vencedor = false;

        //Inicio do Jogo
        System.out.println("\nLet's play Tic Tac Toe!!!\n");

        //Bloco para apresentar o quadro de jogo inicial
        for (int i = 0; i < 3; i++) {

            System.out.print("   ");

            for (int j = 0; j < 3; j++) {
                quadro[i][j] = "_ ";
                System.out.print(quadro[i][j]);
            }
            System.out.println("\n");
        }

        //Bloco p iniciar as 9 jogadas possiveis
        for (int p = 1; p <= 9 && !vencedor; p++) {

            //Bloco para solicitar as jogadas aos jogadores
            do {
                if (p % 2 != 0) {

                    jogador = "A";
                    System.out.print("\nJogador A indique a Linha (1 a 3): ");
                    linha = scanner.nextInt() - 1;

                    System.out.print("\nJogador A indique a coluna (1 a 3): ");
                    coluna = scanner.nextInt() - 1;

                } else {

                    jogador = "B";
                    System.out.print("\nJogador B indique a Linha (1 a 3): ");
                    linha = scanner.nextInt() - 1;

                    System.out.print("\nJogador B indique a coluna (1 a 3): ");
                    coluna = scanner.nextInt() - 1;
                }

                //Bloco se a jogada efetuada é válida ou não
                //Ponta do if p identificar a jogada inválida
                if (!quadro[linha][coluna].equals("_ ")) {
                    System.out.println("\n   Posição já ocupada por " + quadro[linha][coluna] + ". Tente novamente!");

                    //Ponta do if p identificar a jogada válida
                } else {
                    if (p % 2 != 0) {
                        quadro[linha][coluna] = "X ";
                    } else {
                        quadro[linha][coluna] = "O ";
                    }
                    break;
                }
            } while (true);

            System.out.print("\n");

            //Bloco p recriar o jogo
            for (int i = 0; i < 3; i++) {

                System.out.print("    ");

                for (int j = 0; j < 3; j++) {
                    System.out.print(quadro[i][j]);
                }
                System.out.println("\n");
            }

            //Bloco p validar vencedor nas linhas
            for (int i = 0; i < 3 && !vencedor; i++) {

                for (int j = 0, countA = 0, countB = 0; j < 3 && !vencedor; j++) {

                    if (quadro[i][j].equals("X ")) {

                        countA++;

                        if (countA == 3) {  // Se todos os 3 elementos da linha forem "X "

                            System.out.println("O jogador " + jogador + " venceu!");
                            vencedor = true;
                            break;  // Quebra o loop se houver um vencedor
                        }
                    }
                    if (quadro[i][j].equals("O ")) {

                        countB++;

                        if (countB == 3) {  // Se todos os 3 elementos da linha forem "X "
                        
                            System.out.println("O jogador " + jogador + " venceu!");
                            vencedor = true;
                            break;  // Quebra o loop se houver um vencedor
                        }
                    }
                }
                System.out.println("");
            }
            //Bloco p validar vencedor nas colunas
            for (int j = 0; j < 3 && !vencedor; j++) {

                for (int i = 0, countA = 0, countB = 0; i < 3 && !vencedor; i++) {

                    if (quadro[i][j].equals("X ")) {

                        countA++;

                        if (countA == 3) {  // Se todos os 3 elementos da linha forem "X "

                            System.out.println("O jogador " + jogador + " venceu!");
                            vencedor = true;
                            break;  // Quebra o loop se houver um vencedor
                        }
                    }
                    if (quadro[i][j].equals("O ")) {

                        countB++;

                        if (countB == 3) {  // Se todos os 3 elementos da linha forem "X "
                        
                            System.out.println("O jogador " + jogador + " venceu!");
                            vencedor = true;
                            break;  // Quebra o loop se houver um vencedor
                        }
                    }
                }
                System.out.println("");
            }
        }
        scanner.close();
        System.out.println("\nWell played!!!\n");
    }
}
