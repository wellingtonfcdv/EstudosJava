package heranca;

public class Main {
    public static void main(String[] args) {
        SuperHerois[] superHerois = {
            new HomemAranha("Roupa vermelha com teias", new String[]{"Lançar teia"}),
            new HomemDeFerro("Armadura vermelha super resistente", new String[]{"Usar traje de guerra"}),
            new Tempestade("Roupa branca", new String[]{"Contra tempestade"}),
            new ViuvaNegra("Roupa vermelha / preta", new String[]{"Espiã"})
        };

        for(SuperHerois superHeroi : superHerois){
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoder(0);
        }
    }
   
}
