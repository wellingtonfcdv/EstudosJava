package TodoList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {
    public static void main(String[] args) {
        
    }
    private List<Todo> todos;

    public TodoList(){
        this.todos = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa){
        Todo todo = new Todo(tarefa);
        if(!todos.contains(todo))
            todos.add(todo);
    }

    public void removerTarefa(String tarefa){
        Iterator<Todo> it = todos.iterator();
        while(it.hasNext()){
            Todo todo = it.next();
            if(todo.getTitulo().equals(tarefa))
                it.remove();
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Todo todo: todos){
            if(todo.isConcluida())
                builder.append("[x] ");
            else
                builder.append("[ ] ");
            builder.append(todo.getTitulo());
            builder.append("\n");
        }
        return builder.toString();
    }
}
