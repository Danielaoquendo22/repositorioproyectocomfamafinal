package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.repositories.IEstadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoServicio {

    @Autowired
    IEstadosRepositorio iEstadosRepositorio;

    //LISTAN LOS METODOS PARA ACCIONAR LA LOGICA DE NEGOCIO
    //ALMACENAR EN LA BASE DE DATOS UN ESTADO
    public Estados agragarEstados(Estados datosEstado)throws Exception{

       try{
           //Aplico las validaciones necesarias

           //Llama la repositorio e intenta realizar la op en BD
           return this.iEstadosRepositorio.save(datosEstado);

       }catch (Exception error){
           throw new Exception(error.getMessage());
       }
    }


    //BUSCAR TODOS LOS ESTADOS EN QUE HAY EN UNA BASE DE DATOS
    public List<Estados> buscarTodosEsatdos()throws Exception{
        try{
            return this.iEstadosRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }


/*
    //BUSCAR UN ESTADO POR ID
    public Estados buscarEstadoPorId(Integer id){
        return null;
    }

    //MODIFICAR EL NOMBRE DE UN ESTADO
    public Estados modificarEstado(Integer id, Estados datosModificar){
        return  null;
    }

    //ELIMINAR UN ESTADO DE LA BASE DE DATOS
    public Boolean eliminarEstado(Integer Id){
        return true;
    }*/
}
