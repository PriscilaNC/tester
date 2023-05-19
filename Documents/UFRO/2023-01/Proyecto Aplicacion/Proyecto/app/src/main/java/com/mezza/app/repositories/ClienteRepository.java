package com.Mezza.project.repositories;

import com.Mezza.project.models.Administrador;
import com.Mezza.project.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{}
