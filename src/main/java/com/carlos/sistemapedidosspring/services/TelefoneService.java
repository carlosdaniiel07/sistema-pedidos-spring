package com.carlos.sistemapedidosspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.Telefone;
import com.carlos.sistemapedidosspring.repositories.TelefoneRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class TelefoneService {
	@Autowired // (Injeção de dependência)
	private TelefoneRepository repository;
	
	// Busca todaos os telefones no banco de dados
	public List<Telefone> listar(){
		return repository.findAll();
	}
	
	// Busca um telefone por Id
	public Telefone buscar(int id) {
		Optional<Telefone> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Telefone não encontrado"));
	}

	// Insere um telefone no banco de dados
	public void inserir(Telefone obj)
	{
		repository.save(obj);
	}
	
	// Insere uma coleção de telefones no banco de dados
	public void inserir(Iterable<Telefone> objs)
	{
		repository.saveAll(objs);
	}
}
