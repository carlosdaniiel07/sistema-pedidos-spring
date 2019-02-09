package com.carlos.sistemapedidosspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Cliente;
import com.carlos.sistemapedidosspring.repositories.ClienteRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	
	// Busca todos os clientes no banco de dados
	public List<Cliente> listar(){
		return repository.findAll();
	}
	
	// Busca um cliente no banco de dados
	public Cliente buscar(int id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
	}
	
	// Insere um cliente no banco de dados
	public void inserir(Cliente obj) {
		repository.save(obj);
	}
}
