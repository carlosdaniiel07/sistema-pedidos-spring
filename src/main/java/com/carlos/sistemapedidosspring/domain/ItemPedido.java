package com.carlos.sistemapedidosspring.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemPedido implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ItemPedidoPK id = new ItemPedidoPK();
	
	private int quantidade;
	private double preco;
	private double desconto;
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Pedido pedido, Produto produto, int quantidade, double preco, double desconto) {
		super();
		
		this.id.setPedido(pedido);
		this.id.setProduto(produto);
		
		this.quantidade = quantidade;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	@JsonIgnore
	public Pedido getPedido() {
		return this.getId().getPedido();
	}
	
	public Produto getProduto() {
		return this.getId().getProduto();
	}

	public ItemPedidoPK getId() {
		return id;
	}
	
	public void setId(ItemPedidoPK id) {
		this.id = id;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public double getSubtotal() {
		return quantidade * preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
