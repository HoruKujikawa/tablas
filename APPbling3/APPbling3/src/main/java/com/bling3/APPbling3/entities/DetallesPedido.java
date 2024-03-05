package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DetallesPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detalles_pedido;
    private Long unidades;

    public DetallesPedido(Long id_detalles_pedido, Long unidades) {
        this.id_detalles_pedido = id_detalles_pedido;
        this.unidades = unidades;
    }

    public Long getId_detalles_pedido() {
        return id_detalles_pedido;
    }

    public void setId_detalles_pedido(Long id_detalles_pedido) {
        this.id_detalles_pedido = id_detalles_pedido;
    }

    public Long getUnidades() {
        return unidades;
    }

    public void setUnidades(Long unidades) {
        this.unidades = unidades;
    }

}
