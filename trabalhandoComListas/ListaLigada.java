public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;


    public void adicionaNoComeco(Object elemento){


        if(this.totalDeElementos == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = this.primeira;
        }else{
            Celula nova = new Celula(this.primeira,elemento);
            this.primeira.setAnterior(nova);
        }
        this.totalDeElementos++;
    }

    public void adiciona(Object elemento){
        if(this.totalDeElementos == 0){
            adicionaNoComeco(elemento);
        }else{
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
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

    public int tamanho(){
        return this.totalDeElementos;
    }

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

    public void removeDoComeco(){
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Lista vazia.");
        }
        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }
}
