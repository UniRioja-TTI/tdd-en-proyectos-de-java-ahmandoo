package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();
    private List<String> agendaEmails = new ArrayList<>();

    public void guardarTarea(ToDo tarea) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public List<ToDo> obtenerTodas() { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void eliminarTarea(ToDo tarea) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public void añadirEmail(String email) { throw new UnsupportedOperationException("Clase aún no implementada."); }
    public List<String> getAgenda() { throw new UnsupportedOperationException("Clase aún no implementada."); }
}