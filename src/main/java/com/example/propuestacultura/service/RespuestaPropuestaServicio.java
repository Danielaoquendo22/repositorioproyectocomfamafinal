package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.RespuestaPropuesta;
import com.example.propuestacultura.repositories.IRespuestaPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
