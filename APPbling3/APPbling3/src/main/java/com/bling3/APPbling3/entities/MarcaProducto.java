package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MarcaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_marcaprod;
    public MarcaProducto(Long id_marcaprod) {
        this.id_marcaprod = id_marcaprod;
    }
    public Long getId_marcaprod() {
        return id_marcaprod;
    }

    public void setId_marcaprod(Long id_marcaprod) {
        this.id_marcaprod = id_marcaprod;
    }

}
