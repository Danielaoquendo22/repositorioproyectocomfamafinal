package com.example.propuestacultura.repositories;

import com.example.propuestacultura.models.RespuestaPropuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRespuestaPropuestaRepositorio extends JpaRepository<RespuestaPropuesta,Integer> {
}
