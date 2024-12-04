package heranca;

public class SuperHerois {
    private String traje;
    private String[] superPoderes;

    
    public SuperHerois(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }


    public void usarSuperPoder(int index){
        System.out.println("Usando super poder "+ superPoderes[index]);
    }

    public String getTraje(){
        return traje;
    }
}
