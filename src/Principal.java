import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();

        try{
            Endereco novoEndereco = consultaCep.buscaEndereco("06436410");
            System.out.println(novoEndereco);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação...");
        }

    }
}