package com.portfoliomlh.MLH.repository;

import com.portfoliomlh.MLH.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByEmailAndIsEnabledTrue(String email);
}