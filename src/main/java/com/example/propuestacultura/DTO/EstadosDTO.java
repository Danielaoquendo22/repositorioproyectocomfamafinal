package com.example.propuestacultura.DTO;

public class EstadosDTO {

    private String nombreEstado;

    public EstadosDTO() {
    }

    public EstadosDTO(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}
