package operacoesLogica;

/*Operações lógicas com If e Else*/

public class OperacoesIf_Else {

	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "João";

		if (mediaAluno >= 70 && nome.equals("Wellington")) {
			System.out.println("Parabéns você está aprovado.");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado.");
		} else {
			System.out.println("Aluno não encontrado");
		}
	}

}