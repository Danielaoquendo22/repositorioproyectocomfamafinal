package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.repositories.INotificacionesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacionRepositorioServicio {
    @Autowired
    INotificacionesRepositorio iNotificacionesRepositorio;
    public Notificaciones agregarNotifocacion(Notificaciones datosNotificacion) throws Exception{
        try{
            //Aplico las validaciones necesarias

            //Llama la repositorio e intenta realizar la op en BD
            return this.iNotificacionesRepositorio.save(datosNotificacion);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
