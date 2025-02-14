package br.com.geracaoEstatistica;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//2 -Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. No código a seguir, há um exemplo prático do resultado esperado.
public class PalavrasAgrupadas {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java","stream","lambda","code","sol","uva");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
    }
}
