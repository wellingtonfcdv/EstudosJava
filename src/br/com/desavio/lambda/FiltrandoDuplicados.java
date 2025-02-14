package br.com.desavio.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//4 - Filtrando dados duplicados

public class FiltrandoDuplicados {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple","banana","apple","orange","banana");
        List<String> unicas = palavras.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unicas);
    }
}
