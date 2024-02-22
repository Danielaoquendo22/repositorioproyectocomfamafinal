package com.example.propuestacultura.DTO;

import jakarta.persistence.Column;

public class SolicitanteDTO {

    private String nombreProponente;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private String numeroDocumento;
    private String telefonoFijo;
    private String telefonoCelular;
    private String correo;

    public SolicitanteDTO() {
    }

    public SolicitanteDTO(String nombreProponente, String tipoDocumento, String nombres, String apellidos, String numeroDocumento, String telefonoFijo, String telefonoCelular, String correo) {
        this.nombreProponente = nombreProponente;
        this.tipoDocumento = tipoDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.correo = correo;
    }

    public String getNombreProponente() {
        return nombreProponente;
    }

    public void setNombreProponente(String nombreProponente) {
        this.nombreProponente = nombreProponente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
