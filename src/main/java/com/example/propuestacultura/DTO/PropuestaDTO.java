package com.example.propuestacultura.DTO;

import java.time.LocalDate;

public class PropuestaDTO {

    private String nombreProponente;
    private String estado;
    private String municipio;
    private String nombrePropuesta;
    private String presentacionGeneral;
    private LocalDate fechaPresentacionPropuesta;
    private String descripcionActividades;
    private String publicoBeneficiado;
    private String entidadesAliadas;
    private String contraprestaciones;
    private Double montoTotal;
    private Double aporteComfamaMonetario;
    private String aporteComfamaEspecie;
    private Double porcentajeAporteCOmfama;
    private String trayectoria;

    public PropuestaDTO() {
    }

    public PropuestaDTO(String nombreProponente, String estado, String municipio, String nombrePropuesta, String presentacionGeneral, LocalDate fechaPresentacionPropuesta, String descripcionActividades, String publicoBeneficiado, String entidadesAliadas, String contraprestaciones, Double montoTotal, Double aporteComfamaMonetario, String aporteComfamaEspecie, Double porcentajeAporteCOmfama, String trayectoria) {
        this.nombreProponente = nombreProponente;
        this.estado = estado;
        this.municipio = municipio;
        this.nombrePropuesta = nombrePropuesta;
        this.presentacionGeneral = presentacionGeneral;
        this.fechaPresentacionPropuesta = fechaPresentacionPropuesta;
        this.descripcionActividades = descripcionActividades;
        this.publicoBeneficiado = publicoBeneficiado;
        this.entidadesAliadas = entidadesAliadas;
        this.contraprestaciones = contraprestaciones;
        this.montoTotal = montoTotal;
        this.aporteComfamaMonetario = aporteComfamaMonetario;
        this.aporteComfamaEspecie = aporteComfamaEspecie;
        this.porcentajeAporteCOmfama = porcentajeAporteCOmfama;
        this.trayectoria = trayectoria;
    }

    public String getNombreProponente() {
        return nombreProponente;
    }

    public void setNombreProponente(String nombreProponente) {
        this.nombreProponente = nombreProponente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public String getPresentacionGeneral() {
        return presentacionGeneral;
    }

    public void setPresentacionGeneral(String presentacionGeneral) {
        this.presentacionGeneral = presentacionGeneral;
    }

    public LocalDate getFechaPresentacionPropuesta() {
        return fechaPresentacionPropuesta;
    }

    public void setFechaPresentacionPropuesta(LocalDate fechaPresentacionPropuesta) {
        this.fechaPresentacionPropuesta = fechaPresentacionPropuesta;
    }

    public String getDescripcionActividades() {
        return descripcionActividades;
    }

    public void setDescripcionActividades(String descripcionActividades) {
        this.descripcionActividades = descripcionActividades;
    }

    public String getPublicoBeneficiado() {
        return publicoBeneficiado;
    }

    public void setPublicoBeneficiado(String publicoBeneficiado) {
        this.publicoBeneficiado = publicoBeneficiado;
    }

    public String getEntidadesAliadas() {
        return entidadesAliadas;
    }

    public void setEntidadesAliadas(String entidadesAliadas) {
        this.entidadesAliadas = entidadesAliadas;
    }

    public String getContraprestaciones() {
        return contraprestaciones;
    }

    public void setContraprestaciones(String contraprestaciones) {
        this.contraprestaciones = contraprestaciones;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Double getAporteComfamaMonetario() {
        return aporteComfamaMonetario;
    }

    public void setAporteComfamaMonetario(Double aporteComfamaMonetario) {
        this.aporteComfamaMonetario = aporteComfamaMonetario;
    }

    public String getAporteComfamaEspecie() {
        return aporteComfamaEspecie;
    }

    public void setAporteComfamaEspecie(String aporteComfamaEspecie) {
        this.aporteComfamaEspecie = aporteComfamaEspecie;
    }

    public Double getPorcentajeAporteCOmfama() {
        return porcentajeAporteCOmfama;
    }

    public void setPorcentajeAporteCOmfama(Double porcentajeAporteCOmfama) {
        this.porcentajeAporteCOmfama = porcentajeAporteCOmfama;
    }

    public String getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(String trayectoria) {
        this.trayectoria = trayectoria;
    }
}
