package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoAPI;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private final String URL_BASE = "http://parallelum.com.br/fipe/api/v1/";
    private ConsumoAPI consumo = new ConsumoAPI();
    public void exibeMenu() throws IOException {
        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar:
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();

        String endereco;

        if(opcao.toLowerCase().contains("carro")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = "https://parallelum.com.br/fipe/api/v1/motos/marcas";
        }else {
            endereco = URL_BASE +"caminhoes/marcas";
        }


        var json = consumo.obterDados(endereco);
        System.out.println(json);
    }
}
