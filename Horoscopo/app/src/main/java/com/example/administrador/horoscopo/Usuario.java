package com.example.administrador.horoscopo;

/**
 * Created by Fabian on 08-11-2017.
 */

public class Usuario {
    private String nombre_usuario;
    private String clave;
    private int anio;

    public Usuario(String nombre_usuario, String clave, int anio) {
        this.nombre_usuario = nombre_usuario;
        this.clave = clave;
        this.anio = anio;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
