package LidandoComExcecoes;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {
    public static void main(String[] args) throws Exception{
        getNomes();
        //dividir(1,0);
        dividirNovo(1,0);
    }

    // Exceção checável
    private static int dividir(int i, int j) throws Exception{
        if(j == 0)
            throw new Exception("Não é possível realizar divisão por zero!");

        return i / j;
    }
    // Exceção Não checável
    private static int dividirNovo(int i, int j){
        if(j == 0)
            throw new DivisaoPorZero("Não é possível realizar divisão por zero!");

        return i / j;
    }

    private static void getNomes() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Wellington");
        System.out.println(nomes.get(0));
        try{
            //System.out.println(nomes.get(1));
            int resultado = 10 / 0;
        }catch(IndexOutOfBoundsException ex){
            //ex.printStackTrace();
            System.out.println("O índice informado não é válido!");
        }catch(ArithmeticException ex){
            System.out.println("Operação aritimética inválida!");
        }
            
    }
}
