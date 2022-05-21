package com.portfoliomlh.MLH.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Habilidades implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String habilidad;
    private Long porcentaje;

    public Habilidades() {
    }

    public Habilidades(Long id, String habilidad, Long porcentaje) {
        this.id = id;
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public Long getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Habilidades{" +
                "id=" + id +
                ", habilidad='" + habilidad + '\'' +
                ", porcentaje=" + porcentaje +
                '}';
    }
}
