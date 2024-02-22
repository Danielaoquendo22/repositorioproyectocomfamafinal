package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.service.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TipoDocumentoControlador {

    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;

    @PostMapping
   public ResponseEntity<TipoDocumento> agregarTipoDocumento(@RequestBody TipoDocumento datosDocumento){
        /*try{
            return ResponseEntity.status(HttpStatus.OK).body(tipoDocumentoServicio.agregarDocumento(datosDocumento));
        }catch ()*/
return null;
    }

}
