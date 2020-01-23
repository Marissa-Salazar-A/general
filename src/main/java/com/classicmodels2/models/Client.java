package com.classicmodels2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by autozoner on 1/20/2020.
 */
@Entity
@Table(name="cliente")
public class Client {

    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="codigo", unique = true, length = 10)
    private String codigo;
    @Column(name="nombrecliente", length = 60)
    private String nombreCliente;
    @Column(name="direccion", length = 80)
    private String direccion;
    @Column(name="telefono", columnDefinition = "char(20)")
    private String telefono;

    public Client(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
