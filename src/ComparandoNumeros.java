import java.util.Scanner;
/*
* 2. Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando
* se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Informe o número 1: ");
        numero1 = scanner.nextInt();

        System.out.println("Informe o número 2: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é maior que o número " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior que o número " + numero1);
        } else if (numero1 == numero2) {
            System.out.println("Os números são iguais. Número1: " + numero1 + " Número2 " + numero2);
        }else {
            System.out.println("Número informado inválido!");
        }
    }
}
