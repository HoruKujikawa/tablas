package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_inventario;
    private Long cantidad;
    private String fecha;
    private Long cantidad_disponible;
    private String referencia;

    public Inventario(Long id_inventario, Long cantidad, String fecha, Long cantidad_disponible, String referencia) {
        this.id_inventario = id_inventario;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.cantidad_disponible = cantidad_disponible;
        this.referencia = referencia;
    }


    public Long getId_inventario() {
        return id_inventario;
    }

    public void setId_inventario(Long id_inventario) {
        this.id_inventario = id_inventario;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Long getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(Long cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


}
