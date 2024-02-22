package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.FormatosAdjuntoSolicitanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/formatosAdjuntos")
public class FormatoAdjuntoSolicitanteControlador {

    @Autowired
    FormatosAdjuntoSolicitanteServicio formatosAdjuntoSolicitante;
    @PostMapping
    public ResponseEntity<FormatosAdjuntoSolicitante> agregarFormatoAdjunto(@RequestBody FormatosAdjuntoSolicitante datosFormatosAdjuntos){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK).body(formatosAdjuntoSolicitante.agragarFormatosAdjuntos(datosFormatosAdjuntos));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
}
