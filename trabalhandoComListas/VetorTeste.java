public class VetorTeste {
    public static void main(String[] args)  {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");
        Aluno a3 = new Aluno("Danilo");
        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        lista.adiciona(1,a3);
        System.out.println(lista);

        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a3));

        Aluno x = lista.pega(1);
        System.out.println(x);

    }
}
