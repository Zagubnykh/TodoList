
import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        // Добавление переданного дела в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // Добавление дела на указаный индекс,
        //  проверка возможности добавления
        if (index >= 0 && index < todoList.size()) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
    }

    public void edit(int index, String todo) {
        // Замена дела по переданному индексу,
        //  проверка возможности изменения
        if (index >=0 && index < todoList.size()){
            todoList.set(index, todo);
        }
    }

    public void delete(int index) {
        // Удаление дела находящегося по переданному индексу,
        //  проверка возможности удаления дела
        if (index >=0 && index < todoList.size()) {
            todoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // Возвращение списка дел
        return todoList;
    }

}