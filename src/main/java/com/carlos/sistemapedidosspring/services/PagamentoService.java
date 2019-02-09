package com.carlos.sistemapedidosspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Pagamento;
import com.carlos.sistemapedidosspring.repositories.PagamentoRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class PagamentoService {
	@Autowired
	private PagamentoRepository repository;
	
	// Busca todas as pagamentos no banco de dados
	public List<Pagamento> listar(){
		return repository.findAll();
	}
	
	// Busca uma pagamento por Id
	public Pagamento buscar(int id) {
		Optional<Pagamento> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Pagamento não encontrado"));
	}

	// Insere uma pagamento no banco de dados
	public void inserir(Pagamento obj)
	{
		repository.save(obj);
	}
	
	// Insere uma coleção de pagamentos no banco de dados
	public void inserir(Iterable<Pagamento> objs)
	{
		repository.saveAll(objs);
	}
}
