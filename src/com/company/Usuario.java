package com.company;

public class Usuario {
    private String nombre;
    private String legajo;

    public Usuario(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public Usuario() {
        nombre = "";
        legajo = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}
