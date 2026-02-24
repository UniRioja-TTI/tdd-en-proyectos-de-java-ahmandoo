package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> listaToDo = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public void addToDo(ToDo todo) {
        listaToDo.add(todo);
    }

    public boolean deleteToDo(String nombre) {
        for (int i = 0; i < listaToDo.size(); i++) {
            if (listaToDo.get(i).getNombre().equalsIgnoreCase(nombre)) {
                listaToDo.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean updateToDo(String nombre, ToDo updatedToDo) {
        for (int i = 0; i < listaToDo.size(); i++) {
            ToDo todo = listaToDo.get(i);
            if (todo.getNombre().equalsIgnoreCase(nombre)) {
                listaToDo.set(i, updatedToDo);
                return true;
            }
        }
        return false;
    }

    public ToDo getToDo(String nombre) {
        for (ToDo todo : listaToDo) {
            if (todo.getNombre().equalsIgnoreCase(nombre)) {
                return todo;
            }
        }
        return null;
    }

    public List<ToDo> getToDos() {
        return listaToDo;
    }

    public void addEmail(String email) {
        emails.add(email);
    }
    public List<String> getEmails() {
        return emails;
    }

    public boolean deleteEmail(String email) {
        return emails.remove(email);
    }

}
