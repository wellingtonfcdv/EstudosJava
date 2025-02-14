package br.com.geracaoEstatistica;
//3 - Concatenando elementos da lista

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenandoElementos {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice","Bob","Charlie");
        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
