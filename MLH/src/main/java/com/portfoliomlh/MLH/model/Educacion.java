package com.portfoliomlh.MLH.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long anio_inicio;
    private Long anio_fin;
    private String tipoEdu;
    private String institucion;
    private String imageUrl;

    public Educacion() {
    }

    public Educacion(Long id, Long anio_inicio, Long anio_fin, String tipoEdu, String institucion, String imageUrl) {
        this.id = id;
        this.anio_inicio = anio_inicio;
        this.anio_fin = anio_fin;
        this.tipoEdu = tipoEdu;
        this.institucion = institucion;
        this.imageUrl = imageUrl;
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

    public String getTipoEdu() {
        return tipoEdu;
    }

    public void setTipoEdu(String tipoEdu) {
        this.tipoEdu = tipoEdu;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", anio_inicio=" + anio_inicio +
                ", anio_fin=" + anio_fin +
                ", tipoEdu='" + tipoEdu + '\'' +
                ", institucion='" + institucion + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
