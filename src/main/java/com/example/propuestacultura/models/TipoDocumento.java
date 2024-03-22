package com.example.propuestacultura.models;

import jakarta.persistence.*;

@Entity
@Table(name="tipo_documento")
public class TipoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_documento")
    private Integer idTipoDocumento;
    private String tipoDocumento;

    public TipoDocumento() {
    }

    public TipoDocumento(Integer idTipoDocumento, String tipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public static TipoDocumento agregarTipoDocumento(TipoDocumento datosTipoDocumento) {
        return null;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
