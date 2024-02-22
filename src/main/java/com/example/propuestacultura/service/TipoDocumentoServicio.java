package com.example.propuestacultura.service;

import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repositories.ITipoDcumento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoServicio {
    @Autowired
    ITipoDcumento iTipoDcumento;

    public TipoDocumento agregarDocumento(TipoDocumento datosDocumento) throws Exception{
        try{
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iTipoDcumento.save(datosDocumento);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
