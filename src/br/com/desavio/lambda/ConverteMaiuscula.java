package br.com.desavio.lambda;

import java.util.Arrays;
import java.util.List;

//2 - Convertendo strings para maiúsculas
public class ConverteMaiuscula {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java","stream","lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
