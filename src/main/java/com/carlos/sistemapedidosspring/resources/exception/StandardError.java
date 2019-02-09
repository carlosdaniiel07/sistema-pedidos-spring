package com.carlos.sistemapedidosspring.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int httpStatus;
	private String erro;
	private Long instante;
	
	public StandardError() {
		
	}
	
	public StandardError(int httpStatus, String erro, Long instante) {
		super();
		this.httpStatus = httpStatus;
		this.erro = erro;
		this.instante = instante;
	}
	
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	
	public String getErro() {
		return erro;
	}
	
	public void setErro(String erro) {
		this.erro = erro;
	}
	
	public Long getInstante() {
		return instante;
	}
	
	public void setInstante(Long instante) {
		this.instante = instante;
	}
}
