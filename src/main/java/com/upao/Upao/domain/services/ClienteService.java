package com.upao.Upao.domain.services;


import com.upao.Upao.domain.entities.cliente;

import java.util.List;

public interface ClienteService {
    List<cliente> Listar();
    cliente registrarcliente(cliente cliente);
}
