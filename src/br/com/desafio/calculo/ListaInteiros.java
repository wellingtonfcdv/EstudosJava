package br.com.desafio.calculo;

import java.util.Arrays;
import java.util.List;

//5 - Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista onde cada número foi
// multiplicado por 3. Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro, assim
// como vimos na função forEach.
public class ListaInteiros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.replaceAll(m-> m * 3);
        System.out.println(numeros);
    }
}
