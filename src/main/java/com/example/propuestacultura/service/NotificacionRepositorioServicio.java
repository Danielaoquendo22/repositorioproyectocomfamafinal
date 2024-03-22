package com.example.propuestacultura.service;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.repositories.INotificacionesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Notificaciones> buscarTodasNotificaciones()throws Exception{
        try{
            return this.iNotificacionesRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    public Notificaciones buscarNotificacionesPorId(Integer id)throws Exception{

        try{
            if(this.iNotificacionesRepositorio.findById(id).isPresent()){
                return  this.iNotificacionesRepositorio.findById(id).get();
            }else{
                throw new Exception("Estado no encontrado");
            }

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
}
