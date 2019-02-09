package com.carlos.sistemapedidosspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.sistemapedidosspring.domain.ItemPedido;
import com.carlos.sistemapedidosspring.repositories.ItemPedidoRepository;
import com.carlos.sistemapedidosspring.services.exception.ObjectNotFoundException;

@Service
public class ItemPedidoService {
	@Autowired // (Injeção de dependência)
	private ItemPedidoRepository repository;
	
	// Busca todo os itens de pedido no banco de dados
	public List<ItemPedido> listar(){
		return repository.findAll();
	}
	
	// Busca um item de pedido por Id
	public ItemPedido buscar(int id) {
		Optional<ItemPedido> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Item de pedido não encontrado"));
	}

	// Insere um item de pedido no banco de dados
	public void inserir(ItemPedido obj)
	{
		repository.save(obj);
	}
	
	// Insere uma coleção de itens de pedido no banco de dados
	public void inserir(Iterable<ItemPedido> objs)
	{
		repository.saveAll(objs);
	}
}
