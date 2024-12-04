package empresa;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro();
        carro.acelerar();
        carro.frear();
        carro.getPedais();
        
        carro.setVolante("Desviar dos buracos da via!");
        System.out.println(carro.getVolante());
        
    }
}
