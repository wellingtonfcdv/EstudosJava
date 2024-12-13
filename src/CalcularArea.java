import java.util.Scanner;

public class CalcularArea {
    /*3.Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
    Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        double areaQuadrado = 0;
        double ladoQuadrado = 0;


        System.out.println("---- MENU ----");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. Sair");

        opcao = scanner.nextInt();
        while (true){
            if (opcao == 1){
                System.out.println("Informe a media de um dos lados do quadrado: ");
                ladoQuadrado = scanner.nextDouble();
                areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.printf("A área do quadrado informado é " + areaQuadrado);
            } else if (opcao == 2) {
                System.out.println("Informe o raio do círculo: ");
                double  raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.printf("Área do círculo: " + areaCirculo);
            }if (opcao == 3){
                System.out.println("Saindo do sistema...");
                break;
            }
        }


    }
}
