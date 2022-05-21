package com.portfoliomlh.MLH.repository;


import com.portfoliomlh.MLH.model.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProyectosRepo extends JpaRepository<Proyectos, Long> {
    void deleteProyectosById(Long id);

    Optional<Proyectos> findProyectosById(Long id);

}
