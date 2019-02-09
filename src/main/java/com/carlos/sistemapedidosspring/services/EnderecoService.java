package com.carlos.sistemapedidosspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Endereco;
import com.carlos.sistemapedidosspring.repositories.EnderecoRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repository;
	
	// Recupera todos os endereços do banco de dados
	public List<Endereco> listar(){
		return repository.findAll();
	}
	
	// Busca um endereço no banco de dados	
	public Endereco buscar(int id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrado!"));
	}
	
	// Insere uma endereço no banco de dados
	public void inserir(Endereco obj) {
		repository.save(obj);
	}
}
