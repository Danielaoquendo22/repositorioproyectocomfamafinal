package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Propuesta;
import com.example.propuestacultura.models.RespuestaPropuesta;
import com.example.propuestacultura.repositories.IPropuestaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Propuesta> buscarTodasPropuestas()throws Exception{
        try{
            return this.iPropuestaRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Propuesta buscarPropuestaPorId(Integer id)throws Exception{

        try{
            if(this.iPropuestaRepositorio.findById(id).isPresent()){
                return  this.iPropuestaRepositorio.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
