package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.FormatosAdjuntoSolicitanteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public ResponseEntity<List<FormatosAdjuntoSolicitante>> buscarTodosAdjuntos(){

        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(formatosAdjuntoSolicitante.buscarTodosFormatosAdjuntos());

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<FormatosAdjuntoSolicitante> buscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(formatosAdjuntoSolicitante.buscarFormatosAdjuntosPorId(id));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
