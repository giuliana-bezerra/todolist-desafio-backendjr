package br.com.giulianabezerra.todolist;

import java.util.ArrayList;
import java.util.List;

import br.com.giulianabezerra.todolist.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@giulianabezerra", "Curtir", false, 1));
      add(new Todo(9996L, "@giulianabezerra", "Comentar", false, 1));
      add(new Todo(9997L, "@giulianabezerra", "Compartilhar", false, 1));
      add(new Todo(9998L, "@giulianabezerra", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@giulianabezerra", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}
