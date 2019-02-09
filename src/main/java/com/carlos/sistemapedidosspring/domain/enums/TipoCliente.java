package com.carlos.sistemapedidosspring.domain.enums;

public enum TipoCliente {
	// values
	PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica");
	
	private final int codigo;
	private final String descricao;
	
	private TipoCliente(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCodigo() {
		return codigo;
	}
	
	// Converte um inteiro para enum
	public static TipoCliente toEnum(int codigo){
		for(TipoCliente t : values()) {
			if (t.getCodigo() == codigo) {
				return t;
			}
		}
		return null;
	}	
	
	// Converte um enum para inteiro
	public static int toInt(TipoCliente enumObj) {
		return enumObj.getCodigo();
	}
}
