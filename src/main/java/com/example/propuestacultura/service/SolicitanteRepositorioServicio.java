package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Solicitante;
import com.example.propuestacultura.repositories.ISolicitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SolicitanteRepositorioServicio {

    @Autowired
    ISolicitanteRepositorio iSolicitanteRepositorio;

    public Solicitante agragarSolicitante(Solicitante datosSolicitante) throws Exception {

        try {
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iSolicitanteRepositorio.save(datosSolicitante);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<Solicitante> buscarTodosSolicitante() throws Exception {
        try {
            return this.iSolicitanteRepositorio.findAll();

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }
    public Solicitante buscarSolicitantePorId(Integer id)throws Exception{

        try{
            if(this.iSolicitanteRepositorio.findById(id).isPresent()){
                return  this.iSolicitanteRepositorio.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
