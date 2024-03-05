package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    private String nombre;
    private String estado_de_rol;
    public Rol(Long id_rol, String nombre, String estado_de_rol) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.estado_de_rol = estado_de_rol;
    }


    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado_de_rol() {
        return estado_de_rol;
    }

    public void setEstado_de_rol(String estado_de_rol) {
        this.estado_de_rol = estado_de_rol;
    }

}
