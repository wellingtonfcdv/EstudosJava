import java.util.Scanner;

public class Tabuada {
    /*4.Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero +" x "+ i + " = " + (numero*i));
        }
    }
}
