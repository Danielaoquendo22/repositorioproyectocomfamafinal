package com.example.propuestacultura.DTO;

import java.time.LocalDate;

public class RespuestaPropuestaDTO {

    private String nombrePropuesta;
    private LocalDate fechaRecepcion;
    private Boolean consultaListasPublicas;
    private String areaReceptora;
    private String negocio; //ENUM

    private String observaciones;

    private boolean seApoya;

    private String descripcionApoyo;

    private String respuesta;

    private String encargadoRespuesta;

    private String medioNotificacion;

    public RespuestaPropuestaDTO() {
    }

    public RespuestaPropuestaDTO(String nombrePropuesta, LocalDate fechaRecepcion, Boolean consultaListasPublicas, String areaReceptora, String negocio, String observaciones, boolean seApoya, String descripcionApoyo, String respuesta, String encargadoRespuesta, String medioNotificacion) {
        this.nombrePropuesta = nombrePropuesta;
        this.fechaRecepcion = fechaRecepcion;
        this.consultaListasPublicas = consultaListasPublicas;
        this.areaReceptora = areaReceptora;
        this.negocio = negocio;
        this.observaciones = observaciones;
        this.seApoya = seApoya;
        this.descripcionApoyo = descripcionApoyo;
        this.respuesta = respuesta;
        this.encargadoRespuesta = encargadoRespuesta;
        this.medioNotificacion = medioNotificacion;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public LocalDate getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(LocalDate fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Boolean getConsultaListasPublicas() {
        return consultaListasPublicas;
    }

    public void setConsultaListasPublicas(Boolean consultaListasPublicas) {
        this.consultaListasPublicas = consultaListasPublicas;
    }

    public String getAreaReceptora() {
        return areaReceptora;
    }

    public void setAreaReceptora(String areaReceptora) {
        this.areaReceptora = areaReceptora;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isSeApoya() {
        return seApoya;
    }

    public void setSeApoya(boolean seApoya) {
        this.seApoya = seApoya;
    }

    public String getDescripcionApoyo() {
        return descripcionApoyo;
    }

    public void setDescripcionApoyo(String descripcionApoyo) {
        this.descripcionApoyo = descripcionApoyo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEncargadoRespuesta() {
        return encargadoRespuesta;
    }

    public void setEncargadoRespuesta(String encargadoRespuesta) {
        this.encargadoRespuesta = encargadoRespuesta;
    }

    public String getMedioNotificacion() {
        return medioNotificacion;
    }

    public void setMedioNotificacion(String medioNotificacion) {
        this.medioNotificacion = medioNotificacion;
    }
}
