package com.example.propuestacultura.repositories;

import com.example.propuestacultura.models.TipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDcumento extends JpaRepository<TipoDocumento,Integer> {
}
