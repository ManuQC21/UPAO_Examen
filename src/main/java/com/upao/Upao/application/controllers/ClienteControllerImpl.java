package com.upao.Upao.application.controllers;


import com.upao.Upao.domain.entities.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import java.util.List;

public class ClienteControllerImpl {
    @Autowired
    ClienteControllerImpl clienteServiceImpl;


    public List<cliente> Listar() {
        return clienteServiceImpl.Listar();
    }


    public <CreateUserRequest> ResponseEntity<cliente> register(CreateUserRequest createUserRequest) {

        ResponseEntity<cliente> cliente = this.clienteServiceImpl.register(createUserRequest);

        return new ResponseEntity<cliente>((MultiValueMap<String, String>) cliente, HttpStatus.OK);
    }
}
