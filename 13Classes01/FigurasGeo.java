
import java.util.Scanner;

public abstract class FigurasGeo {

    public class Poligonos{

        public double largura;
        public double altura;

    }
    public class NaoPoligonais{

        public static double area;
        public static double diametro;
        public static double perimetro;

        public double calculoDiametro(double raio) {
            return 2 * raio;
        }

        public double calculoArea(double raio) {
            return Math.PI * Math.pow(raio, 2);
        }

        public double calculoPerimetro(double raio) {
            return 2 * Math.PI * raio;
        }

    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDeseja calcular os valores de Formas Geométricas 2D ou 3D?");
        System.out.print("Digite 2D para formas Geométricas de duas dimensões ou 3D para três dimensões: ");
        String selectFG = scanner.nextLine();

        if ("2D".equals(selectFG) || "2d".equals(selectFG)) {
            System.out.println("\nDeseja calcular os valores de :");
            System.out.println("\n\tPolígonos (P);");
            System.out.println("\tFormas Não-Poligonais (NP);");
            System.out.print("\nDigite P, NP: ");
            String selectPNP = scanner.nextLine();

            if ("NP".equals(selectPNP) || "np".equals(selectPNP)) {
                System.out.println("\nDeseja calcular os valores da Circunferência (C) ou da Elipse (E) :");
                System.out.println("\n\tCircunferência (C);");
                System.out.println("\tElipse (E);");
                System.out.print("\nDigite C, E: ");
                String selectCE = scanner.nextLine();


                if("C".equals(selectCE) || "c".equals(selectCE)){
                    System.out.print("\nPara calcular a área e o perimetro do círculo digite o raio: ");
                    Double selectRaio = scanner.nextDouble();

                    System.out.println("\nA área do círculo é: " + NaoPoligonais.calculoArea(selectRaio));
                    System.out.println("\nO perimetro do círculo é: " + FigurasGeo.NaoPoligonais.calculoDiametro(selectRaio));
                    System.out.println("\nO perimetro do círculo é: " + FigurasGeo.NaoPoligonais.calculoPerimetro(selectRaio));
                      
                }
            }
        }
        scanner.close();
    }
}
