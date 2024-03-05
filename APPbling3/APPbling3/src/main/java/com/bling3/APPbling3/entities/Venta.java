package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;
    private String estado;
    private LocalDate fecha;
    private Long total_cantidad;
    private Long total_venta;

    public Venta(Long id_venta, String estado, LocalDate fecha, Long total_cantidad, Long total_venta) {
        this.id_venta = id_venta;
        this.estado = estado;
        this.fecha = fecha;
        this.total_cantidad = total_cantidad;
        this.total_venta = total_venta;
    }

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Long getTotal_cantidad() {
        return total_cantidad;
    }

    public void setTotal_cantidad(Long total_cantidad) {
        this.total_cantidad = total_cantidad;
    }

    public Long getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(Long total_venta) {
        this.total_venta = total_venta;
    }


}
