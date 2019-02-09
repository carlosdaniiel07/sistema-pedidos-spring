package com.carlos.sistemapedidosspring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Cidade;
import com.carlos.sistemapedidosspring.repositories.CidadeRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class CidadeService {
	@Autowired
	private CidadeRepository repository;
	
	// Busca todas as cidades no banco de dados
	public List<Cidade> listar(){
		return repository.findAll();
	}
	
	// Busca uma cidade no banco de dados
	public Cidade buscar(int id) {
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Cidade não encontrada"));
	}
	
	// Insere uma cidade no banco de dados
	public void inserir(Cidade obj) {
		repository.save(obj);
	}
	
	// Insere uma coleção de cidades no banco de dados
	public void inserir(Iterable<Cidade> objs){
		repository.saveAll(objs);
	}
}
