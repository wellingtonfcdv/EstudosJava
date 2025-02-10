package br.com.desafio.calculo;

public class LambdaExcercises {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = (a,b) -> a * b;
        System.out.println(multiplicacao.multiplicacao(5,3));
    }
}
