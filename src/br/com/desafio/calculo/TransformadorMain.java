package br.com.desafio.calculo;

public class TransformadorMain {
    public static void main(String[] args) {
        ITransformador toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.transformar("wellington"));
    }


}
