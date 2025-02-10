package br.com.desafio.calculo;
//7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve lançar uma exceção
// de tipo ArithmeticException se o divisor for zero.
public class LambdaDivisao {
    public static void main(String[] args) {
        IDivisor divisor = (a,b) -> {
            if (b == 0) throw  new ArithmeticException("Divisão por zero.");
            return a/b;
        };
        try{
            System.out.println(divisor.dividir(10,2));
            System.out.println(divisor.dividir(10,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
