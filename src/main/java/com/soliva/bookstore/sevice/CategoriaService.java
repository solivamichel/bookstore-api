package com.soliva.bookstore.sevice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soliva.bookstore.domain.Categoria;
import com.soliva.bookstore.dtos.CategoriaDTO;
import com.soliva.bookstore.repositories.CategoriaRepository;
import com.soliva.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria findById( Integer id ) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
	public Categoria create( Categoria obj ) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}

	public Categoria update(Integer id, CategoriaDTO objDto) {
		Categoria obj = findById(id);
		obj.setName(objDto.getName());
		obj.setDescricao(objDto.getDescricao());
		return categoriaRepository.save(obj);
	}
}
