package abstracao;

public class Tv {
    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar(){
        this.ligada = !this.ligada;
        System.out.println(
            "A TV está " + (ligada ? "ligada" : "desligada")
        );
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Volume almentado para " + this.volume);
    }

    public void diminuirVolume(){
        this.volume--;
        System.out.println("Volume diminuido " + this.volume);
    }

    public void trocarCanal(int novoCanal){
        this.canal = novoCanal;
        System.out.println("Troca de canal."+ this.canal);
    }
}
