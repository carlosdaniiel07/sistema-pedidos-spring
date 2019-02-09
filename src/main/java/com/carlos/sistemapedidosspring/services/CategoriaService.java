package com.carlos.sistemapedidosspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Categoria;
import com.carlos.sistemapedidosspring.repositories.CategoriaRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	@Autowired // (Injeção de dependência)
	private CategoriaRepository repository;
	
	// Busca todas as categorias no banco de dados
	public List<Categoria> listar(){
		return repository.findAll();
	}
	
	// Busca uma categoria por Id
	public Categoria buscar(int id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada"));
	}

	// Insere uma categoria no banco de dados
	public void inserir(Categoria obj)
	{
		repository.save(obj);
	}
	
	// Insere uma coleção de categorias no banco de dados
	public void inserir(Iterable<Categoria> objs)
	{
		repository.saveAll(objs);
	}
}
