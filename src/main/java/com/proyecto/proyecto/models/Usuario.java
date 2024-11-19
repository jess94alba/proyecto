package com.proyecto.proyecto.models;

public class Usuario {

    private Integer idCli;
    private String nombre;
    private String apellido;
    
    public Usuario(Integer idCli, String nombre, String apellido) {
        this.idCli = idCli;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Integer getIdCli() {
        return idCli;
    }
    public void setIdCli(Integer idCli) {
        this.idCli = idCli;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
