package com.tt1.test;

import java.util.Date;

public class ToDo {
    private String nombre;
    private String descripción;
    private Date fechaLimite;
    private boolean completado;

    public ToDo(String nombre, String descripción, Date fechaLimite, boolean completado){
        this.nombre=nombre;
        this.descripción=descripción;
        this.fechaLimite=fechaLimite;
        this.completado=completado;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}
