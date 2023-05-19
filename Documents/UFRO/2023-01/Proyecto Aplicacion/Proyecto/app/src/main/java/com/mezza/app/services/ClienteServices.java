package com.Mezza.project.services;

import com.Mezza.project.models.Cliente;
import com.Mezza.project.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente getCliente(Long id) {

        Cliente cliente = clienteRepository.findById(id).orElseThrow();
        return cliente;
    }
}
