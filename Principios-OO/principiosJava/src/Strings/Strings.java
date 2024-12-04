package Strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args){
        String texto1 = "Texto customizado";
        //String outroTexto = new String("Texto cutstomizado");
        //System.out.println(texto);
        //System.out.println(outroTexto);

        //System.out.println(texto == outroTexto);

        //System.out.println(texto.equals(outroTexto));

        char[] texto1Array = texto1.toCharArray();
        for(char letra : texto1Array){
            if(letra == 'a')
            System.out.println("Encontrou a letra "+ "'" + letra + "'");
        }

        //Acessar caracteres especificos na string
        System.out.println(texto1.charAt(0)); //primeira posição
        System.out.println(texto1.charAt(texto1.length()-1)); //ultima posição

        //string com letras maiuscula
        // Capitalizando uma string
        System.out.println(texto1.toLowerCase()); //minuscula
        System.out.println(texto1.toUpperCase()); //maiuscula

        //dividindo uma string em palavras
        String[] palavras = texto1.split(" ");
        System.out.println(Arrays.toString(palavras));

        //arrays de nomes
        String nomes = "Wellington,Moisés, Victor";
        System.out.println(Arrays.toString(nomes.split(",")));

        //Conversões entre tipos
        String idade = "20";
        Integer idadeInt = Integer.valueOf(idade); //De string para int
        idadeInt += 20;
        System.out.println(idadeInt);
        String idadeStr = String.valueOf(idadeInt); //De int para string
        System.out.println(idadeStr);

        //Concatenação com o StringBuilder
        String concatenacao = "Ela " + "é " + "muito " + "comum";
        StringBuilder builder = new StringBuilder();
        builder.append("Ela ");
        builder.append("é ");
        builder.append("muito ");
        builder.append("comum");

        System.out.println(concatenacao);
        System.out.println(builder.toString());

        //formatação de strings complexas

        String nome = "Wellington";
        String username = "wellinfc";
        String email = "wellingtonfc@hotmail.com";

        String textoFormatado = "Olá, eu sou o %s, meu usuário é o %s, e meu e-mail é o %s"
        .formatted(nome, username, email);

        System.out.println(textoFormatado);



    }
}
