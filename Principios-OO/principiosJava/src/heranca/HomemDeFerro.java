package heranca;

public class HomemDeFerro extends SuperHerois{

    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
        System.out.println("Homem de Ferro");
    }

    public void usarSuperPoder(int index){
        System.out.println("Falar com Jarvis.");
        super.usarSuperPoder(index);
    }


    
}
