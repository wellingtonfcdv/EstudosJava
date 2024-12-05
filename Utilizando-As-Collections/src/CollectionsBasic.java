import java.util.ArrayList;
import java.util.List;

public class CollectionsBasic {

    public static void main(String[] args) {
        // String[] nomes = {"Wellington","Joca","Manu"};
        // ArrayList contem o tamnho 10 por padrão
        List<String> nomesArrayList = new ArrayList<>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
            }
        };
        System.out.println(nomesArrayList);

        // Get no ArrayList
        // Get - obter elemento da lista
        System.out.println(nomesArrayList.get(0));
        System.out.println(nomesArrayList.get(1));

        // Insert // Update
        nomesArrayList.set(0, "0");
        nomesArrayList.set(1, "1");
        nomesArrayList.set(2, "2");
        nomesArrayList.set(3, "7");
        System.out.println(nomesArrayList);
        
        // Delete
        nomesArrayList.remove(0);
        System.out.println(nomesArrayList);

    }
}