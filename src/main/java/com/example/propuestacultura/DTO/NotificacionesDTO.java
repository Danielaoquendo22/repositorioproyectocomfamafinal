package com.example.propuestacultura.DTO;

import java.time.LocalDate;

public class NotificacionesDTO {

    private String nombrePropuesta;
    private LocalDate fechaNotificacion;
    private String mensajeNotificacion;
    private String observaciones;

    public NotificacionesDTO() {
    }

    public NotificacionesDTO(String nombrePropuesta, LocalDate fechaNotificacion, String mensajeNotificacion, String observaciones) {
        this.nombrePropuesta = nombrePropuesta;
        this.fechaNotificacion = fechaNotificacion;
        this.mensajeNotificacion = mensajeNotificacion;
        this.observaciones = observaciones;
    }

    public String getNombrePropuesta() {
        return nombrePropuesta;
    }

    public void setNombrePropuesta(String nombrePropuesta) {
        this.nombrePropuesta = nombrePropuesta;
    }

    public LocalDate getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(LocalDate fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getMensajeNotificacion() {
        return mensajeNotificacion;
    }

    public void setMensajeNotificacion(String mensajeNotificacion) {
        this.mensajeNotificacion = mensajeNotificacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
