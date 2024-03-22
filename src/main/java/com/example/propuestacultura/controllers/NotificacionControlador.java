package com.example.propuestacultura.controllers;


import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.service.EstadoServicio;
import com.example.propuestacultura.service.NotificacionRepositorioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notificacion")
public class NotificacionControlador {
    @Autowired
    NotificacionRepositorioServicio notificacionRepositorioServicio;
    @PostMapping
    public ResponseEntity<Notificaciones> agregarNotoficaciones(@RequestBody Notificaciones datosNotificaciones){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionRepositorioServicio.agregarNotifocacion(datosNotificaciones));


        }catch(Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping
    public ResponseEntity<List<Notificaciones>> buscarTodosNotificaciones(){

        try {
            return ResponseEntity
                    .status(HttpStatus.FOUND)
                    .body(notificacionRepositorioServicio.buscarTodasNotificaciones());

        }catch(Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Notificaciones> buscarPorId(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionRepositorioServicio.buscarNotificacionesPorId(id));

        }catch (Exception error){
            return  ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
