package com.soliva.bookstore.dtos;

import java.io.Serializable;

import com.soliva.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private String descricao;
	
	public CategoriaDTO() {
		
	}

	public CategoriaDTO( Categoria obj ) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.descricao = obj.getDescricao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
