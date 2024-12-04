package abstracao;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.ligarDesligar();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.trocarCanal(3);
    }

}
