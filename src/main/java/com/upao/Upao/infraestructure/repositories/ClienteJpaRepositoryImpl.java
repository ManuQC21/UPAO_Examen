package com.upao.Upao.infraestructure.repositories;


import com.upao.Upao.domain.entities.cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteJpaRepositoryImpl {

    @Autowired
    ClienteJpaRepository clienteJpaRepository;


    public List<cliente> Listar() {
        return clienteJpaRepository.findAll();
    }

}
