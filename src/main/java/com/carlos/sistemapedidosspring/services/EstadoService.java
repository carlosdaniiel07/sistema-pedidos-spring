package com.carlos.sistemapedidosspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Estado;
import com.carlos.sistemapedidosspring.repositories.EstadoRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class EstadoService {
	@Autowired
	private EstadoRepository repository;
	
	// Busca todos os estados no banco de dados
	public List<Estado> listar(){
		return repository.findAll();
	}
	
	// Busca um estado no banco de dados
	public Estado buscar(int id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Estado não encontrado"));
	}
	
	// Insere um estado no banco de dados
	public void inserir(Estado obj){
		repository.save(obj);
	}
}
