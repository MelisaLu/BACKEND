package com.portfoliomlh.MLH.repository;

import com.portfoliomlh.MLH.model.ExpLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ExpLaboralRepo extends JpaRepository <ExpLaboral, Long> {

    void deleteExpLaboralById(Long id);

    Optional<ExpLaboral> findExpLaboralById(Long id);
}
