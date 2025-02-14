package br.com.desafio.calculo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//5 - Particionando números ímpares e pares
public class NumerosImparesPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> particionado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + particionado.get(true));
        System.out.println("Ímpares: " + particionado.get(false));
    }
}
