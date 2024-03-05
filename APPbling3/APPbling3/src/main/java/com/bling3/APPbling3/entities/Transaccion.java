package com.bling3.APPbling3.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_transaccion;
    private String nombre_propietario;
    private String metodo_pago;
    private Long cedula;
    private Long numero_tarjeta;
    private Long codigo_seguridad;
    private LocalDate fecha_vencimiento;

    public Transaccion(Long id_transaccion, String nombre_propietario, String metodo_pago, Long cedula, Long numero_tarjeta, Long codigo_seguridad, LocalDate fecha_vencimiento) {
        this.id_transaccion = id_transaccion;
        this.nombre_propietario = nombre_propietario;
        this.metodo_pago = metodo_pago;
        this.cedula = cedula;
        this.numero_tarjeta = numero_tarjeta;
        this.codigo_seguridad = codigo_seguridad;
        this.fecha_vencimiento = fecha_vencimiento;
    }


    public Long getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(Long id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getNombre_propietario() {
        return nombre_propietario;
    }

    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public Long getNumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setNumero_tarjeta(Long numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    public Long getCodigo_seguridad() {
        return codigo_seguridad;
    }

    public void setCodigo_seguridad(Long codigo_seguridad) {
        this.codigo_seguridad = codigo_seguridad;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

}
