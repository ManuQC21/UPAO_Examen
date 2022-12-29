package com.upao.Upao.application.controllers;


import com.upao.Upao.domain.entities.cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClienteController {

    @PostMapping(path = "/registrar") <CreateUserRequest>
    ResponseEntity<cliente> register(@RequestBody CreateUserRequest createUserRequest);

    @GetMapping(value = "/clientes", produces = {"Application/json"})
    List<cliente> Listar();

}
