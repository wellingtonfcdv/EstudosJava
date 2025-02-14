package br.com.geracaoEstatistica;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

//1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
public class MaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10,20,30,40,50,125);

        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Maior número: " + stats.getMax());
    }
}
