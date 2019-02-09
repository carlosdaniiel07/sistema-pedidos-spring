package com.carlos.sistemapedidosspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.sistemapedidosspring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
