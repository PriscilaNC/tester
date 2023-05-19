package com.Mezza.project.controllers;

import com.Mezza.project.models.AdminRegisterDTO;
import com.Mezza.project.models.Cliente;
import com.Mezza.project.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class ClienteControllers {

    @Autowired
    private ClienteServices clienteServices;

    @GetMapping("ver_cliente/{id}")
    public Cliente verCliente(@PathVariable Long id) {
        return clienteServices.getCliente(id);
    }
}
