package com.carlos.sistemapedidosspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Pedido;
import com.carlos.sistemapedidosspring.repositories.PedidoRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository repository;
	
	// Busca todos os pedidos no banco de dados
	public List<Pedido> listar(){
		return repository.findAll();
	}
	
	// Busca um pedido no banco de dados
	public Pedido buscar(int id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado"));
	}
	
	// Insere um pedido no banco de dados
	public void inserir(Pedido obj) {
		repository.save(obj);
	}
	
	// Insere uma coleção de pedidos no banco de dados
	public void inserir(Iterable<Pedido> objs) {
		repository.saveAll(objs);
	}
}
