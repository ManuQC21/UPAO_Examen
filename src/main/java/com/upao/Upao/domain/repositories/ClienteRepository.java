package com.upao.Upao.domain.repositories;


import com.upao.Upao.domain.entities.cliente;

import java.util.List;

public interface ClienteRepository {

    List<cliente> Listar();
    cliente registrarcliente(cliente cliente);
}
