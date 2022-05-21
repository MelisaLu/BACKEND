package com.portfoliomlh.MLH.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String nombreProy;
    private String descripcionProy;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombreProy, String descripcionProy) {
        this.id = id;
        this.nombreProy = nombreProy;
        this.descripcionProy = descripcionProy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getDescripcionProy() {
        return descripcionProy;
    }

    public void setDescripcionProy(String descripcionProy) {
        this.descripcionProy = descripcionProy;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", nombreProy='" + nombreProy + '\'' +
                ", descripcionProy='" + descripcionProy + '\'' +
                '}';
    }
}
