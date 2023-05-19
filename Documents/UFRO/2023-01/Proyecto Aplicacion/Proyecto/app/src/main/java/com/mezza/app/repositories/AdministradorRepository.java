package com.Mezza.project.repositories;

import com.Mezza.project.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdministradorRepository extends JpaRepository<Administrador,Long> {
}
