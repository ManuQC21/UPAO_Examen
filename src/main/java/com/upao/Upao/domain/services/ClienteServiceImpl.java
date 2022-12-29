package com.upao.Upao.domain.services;


import com.upao.Upao.domain.entities.cliente;
import com.upao.Upao.domain.repositories.ClienteRepository;
import com.upao.Upao.infraestructure.repositories.ClienteJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteRepository {

    @Autowired
    ClienteJpaRepositoryImpl clienteJpaRepositoryImpl;

    @Override
    public List<cliente> Listar() {
        return clienteJpaRepositoryImpl.Listar();
    }

    @Override
    public cliente registrarcliente(cliente cliente) {
        cliente cliente1 = new cliente();
        cliente toclient =this.registrarcliente(cliente);
        return toclient;
    }

}
