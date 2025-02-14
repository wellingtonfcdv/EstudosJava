package br.com.desavio.lambda;
//5 - Filtrando e ordenando números primos

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class FiltrandoNumerosPrimos {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(List::stream) //achatar as sublistas em uma única stream
                .filter(FiltrandoNumerosPrimos::ehPrimo)//Filtrar apenas números primos
                .sorted()//ordenar em ordem crescente
                .collect(Collectors.toList());//Coletar em uma lista

        System.out.println(numerosPrimos);
    }

    //função para verificar se um número é primo
    private static boolean ehPrimo(int numero){
        if(numero < 2)// números menores que 2 não são primos
        return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
