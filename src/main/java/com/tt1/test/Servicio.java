package com.tt1.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private IMailer mailer;
    private IRepositorio repo;

    public Servicio(IRepositorio repositorio, IMailer mailer) {
        this.repo = repositorio;
        this.mailer = mailer;
    }

    public void crearToDo(String nombre, LocalDate fechaLimite) {
        alertarTareas();
        if(nombre != null && !nombre.isEmpty() && fechaLimite.isAfter(LocalDate.now())){
            repo.guardarNuevoToDo(new ToDo(nombre, fechaLimite));
        }
    }

    public void agregarEmail(String email) {
        if (email != null && !email.isBlank()) {
            String emailLimpio = email.trim();
            if (emailLimpio.contains("@") && !emailLimpio.startsWith("@") && emailLimpio.endsWith(".com")) {
                repo.guardarEmail(emailLimpio);
            }
        }
    }

    public void finalizarTarea(String nombre) {
        repo.marcarComoCompletado(nombre);
    }

    public List<ToDo> consultarPendientes(){
        alertarTareas();
        List<ToDo> pendientes = new ArrayList<>();
        for(ToDo tarea: repo.obtenerTareas()){
            if(!tarea.isCompletado()){
                pendientes.add(tarea);
            }
        }
        return pendientes;
    }

    private void alertarTareas(){
        for(ToDo tarea: repo.obtenerTareas()){
            if(tarea.getFechaLimite().isBefore(LocalDate.now())){
                for(String email: repo.obtenerEmails()){
                    mailer.enviarCorreo(email, "La tarea "+tarea.getNombre()+" ha caducado su fecha de realización");
                }
            }
        }
    }
}
