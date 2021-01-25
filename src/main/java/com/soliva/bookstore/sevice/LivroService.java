package com.soliva.bookstore.sevice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soliva.bookstore.domain.Livro;
import com.soliva.bookstore.repositories.LivroRepository;
import com.soliva.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;

	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Livro.class.getName()));
	}
}
