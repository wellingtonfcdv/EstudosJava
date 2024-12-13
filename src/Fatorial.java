import java.util.Scanner;

public class Fatorial {
    /*6. Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int fatorial = 1;

        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;

        }
        System.out.println("O fatorial de  " + numero + " é: " + fatorial);
    }
}
