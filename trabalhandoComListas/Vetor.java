import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
        }

    public void adiciona(int posicao, Aluno aluno){

        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida.");
        }

        for (int i = totalDeAlunos - 1; i >= posicao; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalDeAlunos;
    }

    public Aluno pega(int posicao){
        //recebe uma posição e devolve o aluno
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida.");
        }
        return alunos[posicao];
    }

    public void remove(int posicao){
        //remove pela posição
    }

    public boolean contem(Aluno aluno){
        //descobre se o aluno está ou não na lista
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        //devolve a quantidade de alunos
        return totalDeAlunos;
    }

    public String toString(){
        //facilitará na impressão
        return Arrays.toString(alunos);
    }
}
