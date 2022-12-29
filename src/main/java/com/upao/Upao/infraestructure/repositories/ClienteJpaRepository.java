package com.upao.Upao.infraestructure.repositories;


import com.upao.Upao.domain.entities.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteJpaRepository extends JpaRepository<cliente,Long> {
}
