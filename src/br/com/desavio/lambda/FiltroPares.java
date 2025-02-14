package br.com.desavio.lambda;

import java.util.Arrays;
import java.util.List;
//1 - Filtrando números pares
public class FiltroPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
