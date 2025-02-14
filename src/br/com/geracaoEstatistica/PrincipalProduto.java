package br.com.geracaoEstatistica;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class PrincipalProduto {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone",800.0,"Eletrônicos"),
                new Produto("Notebook",1500.0,"Eletrônicos"),
                new Produto("Teclado",200.0,"Eletrônicos"),
                new Produto("Cadeira",300.0,"Móveis"),
                new Produto("Monitor",900.0,"Eletrônicos"),
                new Produto("Mesa",700.0,"Móveis")
        );
        Map<String, List<Produto>> produtosPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println("Produtos agrupados: " +produtosPorCategoria);

        //7 - Quantidade de produtos por categoria
        Map<String, Long> contagemPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println("Produtos por categoria: " + contagemPorCategoria);

        //8 - Obtendo o produto mais caro de cada categoria
        Map<String, Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));

        System.out.println("Produto mais caro por categoria: " + maisCaroPorCategoria);

        //9 - Soma dos valores por categoria
        Map<String, Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));

        System.out.println("Soma preço por categoria: " + somaPrecoPorCategoria);
    }
}
