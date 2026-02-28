package com.tt1.test;

import java.util.List;

public interface IDB {
    void guardarToDo(ToDo tarea);
    ToDo obtenerPorNombre(String nombre);
    List<ToDo> getToDos();
    void actualizarToDo(ToDo tarea);
    void removeToDo(ToDo tarea);
    void addEmail(String email);
    List<String> getAgenda();
}
