package com.carlos.sistemapedidosspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.sistemapedidosspring.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
