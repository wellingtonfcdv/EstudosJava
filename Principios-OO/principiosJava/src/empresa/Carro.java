package empresa;
public class Carro {
    private String volante;
    private String pedais;
    
    private String airbag;
    private Motor motor;

    public Carro(){
        this.motor = new Motor();
        this.volante = "Volante..";
        this.pedais = "Pedias ....";
    
    }

    public void ligarCarro(){
        System.out.println("Ligando o carro...");
    }

    public void acelerar(){
        motor.iniciar();
        System.out.println("Acelerar...");
    }

    public void frear(){
        System.out.println("Frear...");
    }

    private void detectarColisao(){
        ativarAirbags();
    }
    private void ativarAirbags(){
        System.out.println("Airbag..");
    }

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }

    public Motor getMotor() {
        return motor;
    }

    
    
}
