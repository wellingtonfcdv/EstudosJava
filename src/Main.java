import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 1. Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
        * "Número positivo", caso contrário, exiba "Número negativo".*/
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Informe um número inteiro: ");
        numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        }else {
            System.out.println("Número negativo");
        }
    }
}