package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vendedor;
    private Long cod_vendedor;

    public Vendedor(Long id_vendedor, Long cod_vendedor) {
        this.id_vendedor = id_vendedor;
        this.cod_vendedor = cod_vendedor;
    }


    public Long getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(Long id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public Long getCod_vendedor() {
        return cod_vendedor;
    }

    public void setCod_vendedor(Long cod_vendedor) {
        this.cod_vendedor = cod_vendedor;
    }

}
