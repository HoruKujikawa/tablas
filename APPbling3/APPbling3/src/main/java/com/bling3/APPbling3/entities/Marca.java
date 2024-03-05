package com.bling3.APPbling3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marca;
    private String nombre_marca;

    public Long getId_marca() {
        return id_marca;
    }

    public void setId_marca(Long id_marca) {
        this.id_marca = id_marca;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }


    public Marca(Long id_marca, String nombre_marca) {
        this.id_marca = id_marca;
        this.nombre_marca = nombre_marca;
    }

}
