package com.carlos.sistemapedidosspring.domain;

import javax.persistence.Entity;

import com.carlos.sistemapedidosspring.domain.enums.StatusPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private int numeroDeParcelas;

	public PagamentoComCartao() {
		
	}
	
	public PagamentoComCartao(Integer id, StatusPagamento statusPagamento, int numeroDeParcelas, Pedido pedido) {
		super(id, statusPagamento, pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
