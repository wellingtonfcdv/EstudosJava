package LidandoComExcecoes;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {
    public static void main(String[] args) {
        getNomes();
    }

    private static void getNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Wellington");
        System.out.println(nomes.get(0));
        try{
            System.out.println(nomes.get(1));
        }catch(Exception ex){
            //ex.printStackTrace();
            System.out.println("O índice informado não é válido!");
        }

    }
}
