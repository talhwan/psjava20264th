package j071;

import java.util.List;

public class TodoCrud implements Icrud {

    List<TodoItem> todoItems;

    @Override
    public void create(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    @Override
    public TodoItem read(int order) {
        return todoItems.get(order);
    }
}
