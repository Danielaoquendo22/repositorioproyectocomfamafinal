package com.example.propuestacultura.DTO;

public class FormatoAdjuntoSolicitanteDTO {

    private String nombreInhabilidades;
    private String nombreEstraData;

    public FormatoAdjuntoSolicitanteDTO() {
    }

    public FormatoAdjuntoSolicitanteDTO(String nombreInhabilidades, String nombreEstraData) {
        this.nombreInhabilidades = nombreInhabilidades;
        this.nombreEstraData = nombreEstraData;
    }

    public String getNombreInhabilidades() {
        return nombreInhabilidades;
    }

    public void setNombreInhabilidades(String nombreInhabilidades) {
        this.nombreInhabilidades = nombreInhabilidades;
    }

    public String getNombreEstraData() {
        return nombreEstraData;
    }

    public void setNombreEstraData(String nombreEstraData) {
        this.nombreEstraData = nombreEstraData;
    }
}
