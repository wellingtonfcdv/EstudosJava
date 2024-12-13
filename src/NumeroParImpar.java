import java.util.Scanner;

public class NumeroParImpar {
    /*4.Crie um programa que solicite ao usuário a entrada de um número inteiro.
    Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.printf("Informe um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número informado é par. " + numero);
        }else {
            System.out.println("Número informado é ímpar. " + numero);
        }
    }
}
