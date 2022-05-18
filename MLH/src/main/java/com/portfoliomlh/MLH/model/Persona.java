package com.portfoliomlh.MLH.model;

import com.sun.org.apache.xerces.internal.impl.xs.util.StringListImpl;

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
    private String imageUrl;
    private String acercademi;

    public Persona(){}

    public Persona(Long id, String nombre, String apellido, String imageUrl, String acercademi) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imageUrl = imageUrl;
        this.acercademi = acercademi;
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
                ", imageUrl='" + imageUrl + '\'' +
                ", acercademi='" + acercademi + '\'' +
                '}';
    }

}


