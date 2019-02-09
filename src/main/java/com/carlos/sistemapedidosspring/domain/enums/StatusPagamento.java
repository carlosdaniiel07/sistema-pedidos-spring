package com.carlos.sistemapedidosspring.domain.enums;

public enum StatusPagamento {
	PENDENTE(1, "Pendente"), CANCELADO(2, "Cancelado"), PAGO(3, "Pago");
	
	private final int codigo;
	private final String descricao;
	
	private StatusPagamento(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	// Converte um inteiro para enum
	public static StatusPagamento toEnum(int codigo) {
		for(StatusPagamento s : values()) {
			if(s.getCodigo() == codigo) {
				return s;
			}
		}
		return null;
	}
	
	// Converte um enum para inteiro
	public static int toInt(StatusPagamento obj) {
		return obj.getCodigo();
	}
}
