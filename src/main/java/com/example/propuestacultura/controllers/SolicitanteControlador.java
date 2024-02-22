package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Solicitante;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.SolicitanteRepositorioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/solicitante")
public class SolicitanteControlador {

    @Autowired
    SolicitanteRepositorioServicio solicitanteRepositorioServicio;
    @PostMapping
    public ResponseEntity<Solicitante> agregarSolicitante(@RequestBody Solicitante datosSolicitante){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(solicitanteRepositorioServicio.agragarSolicitante(datosSolicitante));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
}
