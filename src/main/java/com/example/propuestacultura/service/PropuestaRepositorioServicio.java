package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Propuesta;
import com.example.propuestacultura.repositories.IPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropuestaRepositorioServicio {

    @Autowired
    IPropuestaRepositorio iPropuestaRepositorio;

    public Propuesta agragarPropuesta(Propuesta datosPropuesta)throws Exception{

        try{
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iPropuestaRepositorio.save(datosPropuesta);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
