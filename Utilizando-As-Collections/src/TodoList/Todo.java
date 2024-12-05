package TodoList;

public class Todo {
    
    private String titulo;
    private boolean concluida;
    
    public Todo(String titulo) {
        this.titulo = titulo;
    }

    public void concluir(){
        this.concluida = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida(){
        return this.concluida;
    }

    public boolean equals(Object todo){
        return this.titulo.equals(((Todo) todo).getTitulo());
    }
    
}
