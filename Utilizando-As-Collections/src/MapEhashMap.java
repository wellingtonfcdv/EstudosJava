import java.util.HashMap;
import java.util.Map;

public class MapEhashMap {
    public static void main(String[] args) {

        // Map e HashMap
        Map<String, String> mapaDeUsuarios = new HashMap<>() {
            {
                // insersão de valores com put
                put("wellington", "Wellington");
                put("gustavo", "Gustavo");
                put("regina", "Regina");
            }
        };
        System.out.println(mapaDeUsuarios);

        // Get
        //Obter um valor dentro de um hashMap
        System.out.println("Buscando o dado no hashMap: " + mapaDeUsuarios.get("wellington"));
        System.out.println("Buscando o dado no hashMap: " + mapaDeUsuarios.get("regina"));

        // Update
        mapaDeUsuarios.put("wellington", "Wellington Feijó");
        System.out.println("Atualização: " + mapaDeUsuarios);

        // Remove
        //mapaDeUsuarios.remove("regina");
        //System.out.println("Remoção: " + mapaDeUsuarios);

        // Iterar os elementos do Map para pegar o valor da chave
        for(String valores : mapaDeUsuarios.values()){
            System.out.println("Pegando o valor da chave no For: " + valores);
        }
        // Iterar os elementos do Map para pegar a chave
        for(String chave : mapaDeUsuarios.keySet()){
            System.out.println("Pegando a chave no For: " + chave);
        }
    }
}
