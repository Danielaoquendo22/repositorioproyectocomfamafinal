package com.example.propuestacultura.service;

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
    public FormatosAdjuntoSolicitante agragarFormatosAdjuntos(FormatosAdjuntoSolicitante datosFormatosAdjuntos)throws Exception{
        try{
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iFormatoAdjuntosSolicitanteRepositorio.save(datosFormatosAdjuntos);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //BUSCAR TODOS LOS ESTADOS EN QUE HAY EN UNA BASE DE DATOS
    public List<FormatosAdjuntoSolicitante> buscarTodosFormatosAdjuntos()throws Exception{
        try{
            return this.iFormatoAdjuntosSolicitanteRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

   //BUSCAR UN ESTADO POR ID
    public FormatosAdjuntoSolicitante buscarFormatosAdjuntosPorId(Integer id)throws Exception{
        try{
            if(this.iFormatoAdjuntosSolicitanteRepositorio.findById(id).isPresent()){
                return  this.iFormatoAdjuntosSolicitanteRepositorio.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
/*
    //MODIFICAR EL NOMBRE DE UN ESTADO
    public FormatoAdjuntoSolicitanteDTO modificarFormatosAdjuntos(Integer id, FormatosAdjuntoSolicitante datosModificar){
        return  null;
    }

    //ELIMINAR UN ESTADO DE LA BASE DE DATOS
    public Boolean eliminarFormatosAdjuntos(Integer Id){
        return true;
    }*/
}
