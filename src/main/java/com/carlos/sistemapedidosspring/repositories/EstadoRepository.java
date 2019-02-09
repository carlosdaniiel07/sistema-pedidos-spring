package com.carlos.sistemapedidosspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.sistemapedidosspring.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
}
