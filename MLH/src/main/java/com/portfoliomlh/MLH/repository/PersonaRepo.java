package com.portfoliomlh.MLH.repository;

import com.portfoliomlh.MLH.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonaRepo extends JpaRepository<Persona, Long> {

    void deletePersonaById(Long id);

    Optional<Persona> findPersonaById(Long id);

}
