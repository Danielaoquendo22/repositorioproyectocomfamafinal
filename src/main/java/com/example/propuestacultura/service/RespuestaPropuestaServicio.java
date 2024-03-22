package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.RespuestaPropuesta;
import com.example.propuestacultura.repositories.IRespuestaPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaPropuestaServicio {
    @Autowired
    IRespuestaPropuestaRepositorio iRespuestaPropuestaRepositorio;

    public RespuestaPropuesta agragarRespuesta(RespuestaPropuesta datosRespuesta)throws Exception{

        try{
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iRespuestaPropuestaRepositorio.save(datosRespuesta);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public List<RespuestaPropuesta> buscarTodasRespuestas()throws Exception{
        try{
            return this.iRespuestaPropuestaRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public RespuestaPropuesta buscarRespuestaPorId(Integer id)throws Exception{

        try{
            if(this.iRespuestaPropuestaRepositorio.findById(id).isPresent()){
                return  this.iRespuestaPropuestaRepositorio.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
