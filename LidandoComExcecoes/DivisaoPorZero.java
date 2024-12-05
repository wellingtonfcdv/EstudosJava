package LidandoComExcecoes;

// Exceções personalizadas
public class DivisaoPorZero extends RuntimeException{
    public DivisaoPorZero(String message){
        super(message);
    }
}
