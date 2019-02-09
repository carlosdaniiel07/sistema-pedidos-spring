package com.carlos.sistemapedidosspring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.sistemapedidosspring.services.EstadoService;

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
	@Autowired
	private EstadoService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(service.listar());
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable int id) {
		return ResponseEntity.ok().body(service.buscar(id));
	}
}
