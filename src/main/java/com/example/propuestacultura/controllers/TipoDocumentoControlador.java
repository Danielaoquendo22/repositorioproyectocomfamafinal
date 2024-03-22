package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.service.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TipoDocumentoControlador {

    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;

    @PostMapping
    public ResponseEntity<TipoDocumento> agregarTipoDocumento(@RequestBody TipoDocumento datosTipoDocumento){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(TipoDocumento.agregarTipoDocumento(datosTipoDocumento));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoDocumento> buscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(tipoDocumentoServicio.buscarTipoDocumentoPorId(id));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

}