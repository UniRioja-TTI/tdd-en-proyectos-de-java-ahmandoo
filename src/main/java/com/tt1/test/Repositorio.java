package com.tt1.test;

import java.util.List;

public class Repositorio implements IRepositorio{
    private final IDB db;

    public Repositorio(IDB db){
        this.db= db;
    }

    @Override
    public ToDo buscarPorNombre(String nombre) {
        return db.obtenerPorNombre(nombre);
    }

    @Override
    public void marcarComoCompletado(String nombre) {
        db.obtenerPorNombre(nombre).setCompletado(true);
    }

    @Override
    public void guardarNuevoToDo(ToDo todo) {
        db.guardarToDo(todo);
    }

    @Override
    public void guardarEmail(String email) {
        db.addEmail(email);
    }

    @Override
    public List<ToDo> obtenerTareas() {
        return db.getToDos();
    }

    @Override
    public List<String> obtenerEmails() {
        return db.getAgenda();
    }
}