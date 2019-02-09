package com.carlos.sistemapedidosspring.domain.enums;

public enum TipoTelefone {
	// values
	CELULAR(1, "Celular"), RESIDENCIAL(2, "Residencial"), COMERCIAL(3, "Comercial");
	
	private final int codigo;
	private final String descricao;
	
	private TipoTelefone(int codigo, String descricao) {
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
	public static TipoTelefone toEnum(int codigo) {
		for(TipoTelefone t : values()) {
			if(t.getCodigo() == codigo) {
				return t;
			}
		}
		return null;
	}
	
	// Converte um enum para inteiro
	public static int toInt(TipoTelefone obj) {
		return obj.getCodigo();
	}
}
