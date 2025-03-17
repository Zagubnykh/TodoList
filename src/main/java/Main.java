package practice;

import java.util.Scanner;
public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // Консольное приложение для работы со списком дел todoList
        while (true) {
            String todoString = new Scanner(System.in).nextLine();
            StringBuilder todo = new StringBuilder();
            String[] words = todoString.split("\\s+");
            if (words[0].equals("LIST")) {
                System.out.println(todoList.getTodos());
            }
            if (words.length >= 2 && words[1].matches("\\d+")) {
                int index = Integer.parseInt(words[1]);
                if (words[0].equals("DELETE")) {
                    todoList.delete(index);
                } else {
                    for (int i = 2; i < words.length; i++) {
                        todo.append(words[i]).append(' ');
                    }
                    todo.deleteCharAt(todo.length() - 1);
                    if (words[0].equals("ADD")) {
                        todoList.add(index, todo.toString());
                    }
                    if (words[0].equals("EDIT")) {
                        todoList.edit(index, todo.toString());
                    }
                }
            } else {
                if (words[0].equals("ADD")) {
                    for (int i = 1; i < words.length; i++) {
                        todo.append(words[i]).append(' ');
                    }
                    todo.deleteCharAt(todo.length() - 1);
                    todoList.add(todo.toString());
                }
            }
        }
    }
}

