package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repositories.ITipoDcumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServicio {
    @Autowired
    ITipoDcumento iTipoDcumento;

    public TipoDocumento agregarDocumento(TipoDocumento datosDocumento) throws Exception {
        try {
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iTipoDcumento.save(datosDocumento);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public List<TipoDocumento> buscarTodosTipoDocumento() throws Exception {
        try {
            return this.iTipoDcumento.findAll();

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }

    }
    public TipoDocumento buscarTipoDocumentoPorId(Integer id)throws Exception{

        try{
            if(this.iTipoDcumento.findById(id).isPresent()){
                return  this.iTipoDcumento.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
