package br.com.desafio.calculo;
//4 - Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão deve ser implementada dentro
// de uma interface funcional com o método boolean verificarPalindromo(String str). Dica: utilize o método reverse da classe StringBuilder.

public class LambdaPalindromo {
    public static void main(String[] args) {
        IPalindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("sol"));
    }

}
