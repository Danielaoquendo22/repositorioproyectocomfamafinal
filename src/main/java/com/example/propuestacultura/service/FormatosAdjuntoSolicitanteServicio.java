package com.example.propuestacultura.service;

import com.example.propuestacultura.DTO.FormatoAdjuntoSolicitanteDTO;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.repositories.IFormatoAdjuntosSolicitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormatosAdjuntoSolicitanteServicio {
    @Autowired
    IFormatoAdjuntosSolicitanteRepositorio iFormatoAdjuntosSolicitanteRepositorio;

    //LISTAN LOS METODOS PARA ACCIONAR LA LOGICA DE NEGOCIO
    //ALMACENAR EN LA BASE DE DATOS UN ESTADO
    public FormatosAdjuntoSolicitante agragarFormatosAdjuntos(FormatosAdjuntoSolicitante datosFormatosAdjuntos){
        return null;
    }

    //BUSCAR TODOS LOS ESTADOS EN QUE HAY EN UNA BASE DE DATOS
    //public List<FormatoAdjuntoSolicitanteDTO> buscarTodosFormatosAdjuntos(){
    //    return null;
    }

   /* //BUSCAR UN ESTADO POR ID
    public FormatoAdjuntoSolicitanteDTO buscarFormatosAdjuntosPorId(Integer id){
        return null;
    }

    //MODIFICAR EL NOMBRE DE UN ESTADO
    public FormatoAdjuntoSolicitanteDTO modificarFormatosAdjuntos(Integer id, FormatosAdjuntoSolicitante datosModificar){
        return  null;
    }

    //ELIMINAR UN ESTADO DE LA BASE DE DATOS
    public Boolean eliminarFormatosAdjuntos(Integer Id){
        return true;
    }*/
}
