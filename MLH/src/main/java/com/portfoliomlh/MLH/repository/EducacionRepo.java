package com.portfoliomlh.MLH.repository;

import com.portfoliomlh.MLH.model.Educacion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EducacionRepo extends JpaRepository <Educacion , Long>{
    void deleteEducacion(Long id);

    Optional<Educacion> findEducacionById(Long id);
}
