public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;


    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(elemento,primeira);
        this.primeira = nova;

        if(this.totalDeElementos == 0){
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }

    public void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);
            this.ultima = nova;
            this.totalDeElementos++;
        }

    }

    /*
        O elemento da esquerda deve apontar para o novo, e este para o da direita.
        Dessa forma pegamos a Célula da esquerda (anterior) e a nova no lugar da próxima (anterior.getProximo).
        Por fim, basta fazer com que a anterior seja a nova e somar 1 no total de elementos
    * */
    public void adiciona(int posicao, Object elemento){
        Celula anterior = this.pegaCelula(posicao -1);
        Celula nova = new Celula(elemento, anterior.getProximo());
        anterior.setProximo(nova);
        this.totalDeElementos++;
    }

    public Object pega(int posicao){

        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao){ }

    public int tamanho(){return 0;}

    public boolean contem(Object o){return false;}

    @Override
    public String toString() {
        if (this.totalDeElementos == 0){
            return "[]";
        }
        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }
        builder.append("]");

        return builder.toString();
    }
    // método para verificar quando a posição estiver ocupada
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    // método que irá apontar para a célula na qual queremos inserir o elemento
    private Celula pegaCelula(int posicao){
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inexistente.");
        }
        Celula atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }
}
