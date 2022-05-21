package com.portfoliomlh.MLH.repository;

import com.portfoliomlh.MLH.model.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HabilidadesRepo extends JpaRepository<Habilidades, Long> {
    void deleteHabilidadesById(Long id);

    Optional<Habilidades> findHabilidadesById(Long id);

}
