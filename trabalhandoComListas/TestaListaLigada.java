public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Wellington");
        System.out.println(lista);
        lista.adicionaNoComeco("Paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("Guilherme");
        System.out.println(lista);

        lista.adiciona("José");
        System.out.println(lista);

        lista.adiciona(2,"Gabriel");
        System.out.println(lista);
    }
}
