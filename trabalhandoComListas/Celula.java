public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }


    public Object getElemento() {
        return elemento;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}