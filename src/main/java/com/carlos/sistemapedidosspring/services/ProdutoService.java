package com.carlos.sistemapedidosspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Produto;
import com.carlos.sistemapedidosspring.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	
	// Busca todos os produtos no banco de dados
	public List<Produto> listar()
	{
		return repository.findAll();
	}
	
	// Busca um produto no banco de dados
	public Produto buscar(int id)
	{
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
	// Insere um produto no banco de dados
	public void inserir(Produto obj)
	{
		repository.save(obj);
	}
	
	// Insere uma coleção de produtos no banco de dados
	public void inserir(Iterable<Produto> objs)
	{
		repository.saveAll(objs);
	}
}
