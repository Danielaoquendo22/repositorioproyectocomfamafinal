package com.example.propuestacultura.controllers;


import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Propuesta;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.PropuestaRepositorioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/propuesta")
public class PropuestaControlador {

    @Autowired
    PropuestaRepositorioServicio propuestaRepositorioServicio;
    @PostMapping
    public ResponseEntity<Propuesta> agregarPropuesta(@RequestBody Propuesta datosPropuesta){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(propuestaRepositorioServicio.agragarPropuesta(datosPropuesta));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping
    public ResponseEntity<List<Propuesta>> buscarTodosPropuesta(){

        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(propuestaRepositorioServicio.buscarTodasPropuestas());

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Propuesta> buscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(propuestaRepositorioServicio.buscarPropuestaPorId(id));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
