package com.tt1.test;

import java.util.List;

public interface IRepositorio {
    ToDo buscarPorNombre(String nombre);
    void marcarComoCompletado(String nombre);
    void guardarNuevoToDo(ToDo todo);
    void guardarEmail(String email);
    List<ToDo> obtenerTareas();
    List<String> obtenerEmails();
}
