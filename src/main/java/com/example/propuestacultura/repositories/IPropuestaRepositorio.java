package com.example.propuestacultura.repositories;

import com.example.propuestacultura.models.Propuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPropuestaRepositorio extends JpaRepository<Propuesta, Integer> {
}
