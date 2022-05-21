package com.portfoliomlh.MLH.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (nullable = false, updatable = false)
    private Long id;

    private String nombre;
    private String apellido;

    private String titulo;
    private String imageUrl;
    private String acercademi;

    public Persona(){}

    public Persona(Long id, String nombre, String apellido, String titulo, String imageUrl, String acercademi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.imageUrl = imageUrl;
        this.acercademi = acercademi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAcercademi() {
        return acercademi;
    }

    public void setAcercademi(String acercademi) {
        this.acercademi = acercademi;
    }

    @Override

    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", titulo='" + titulo + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", acercademi='" + acercademi + '\'' +
                '}';
    }
}


