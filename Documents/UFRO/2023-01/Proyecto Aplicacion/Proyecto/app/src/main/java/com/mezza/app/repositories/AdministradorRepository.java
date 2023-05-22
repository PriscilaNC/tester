package com.mezza.app.repositories;

import com.mezza.app.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long> {
    Optional<Administrador> findByEmail(String email);
}
