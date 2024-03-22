package com.example.propuestacultura.controllers;


import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.RespuestaPropuesta;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.RespuestaPropuestaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/respuesta")
public class RespuestaPropuestaControlador {

    @Autowired
    RespuestaPropuestaServicio respuestaPropuestaServicio;
    @PostMapping
    public ResponseEntity<RespuestaPropuesta> agregarRespuesta(@RequestBody RespuestaPropuesta datosRespuesta){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaPropuestaServicio.agragarRespuesta(datosRespuesta));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping
    public ResponseEntity<List<RespuestaPropuesta>> buscarTodosRespuestaPropuesta(){

        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(respuestaPropuestaServicio.buscarTodasRespuestas());

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<RespuestaPropuesta> buscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(respuestaPropuestaServicio.buscarRespuestaPorId(id));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
