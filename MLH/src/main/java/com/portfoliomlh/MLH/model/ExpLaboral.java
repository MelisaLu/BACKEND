package com.portfoliomlh.MLH.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ExpLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private Long anio_inicio;
    private Long anio_fin;
    private String lugar;
    private String descripcion;

    public ExpLaboral() {
    }

    public ExpLaboral(Long id, Long anio_inicio, Long anio_fin, String lugar, String descripcion) {
        this.id = id;
        this.anio_inicio = anio_inicio;
        this.anio_fin = anio_fin;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAnio_inicio() {
        return anio_inicio;
    }

    public void setAnio_inicio(Long anio_inicio) {
        this.anio_inicio = anio_inicio;
    }

    public Long getAnio_fin() {
        return anio_fin;
    }

    public void setAnio_fin(Long anio_fin) {
        this.anio_fin = anio_fin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ExpLaboral{" +
                "id=" + id +
                ", anio_inicio=" + anio_inicio +
                ", anio_fin=" + anio_fin +
                ", lugar='" + lugar + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
