package com.soliva.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soliva.bookstore.domain.Livro;
import com.soliva.bookstore.sevice.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroResource {
	
	@Autowired
	private LivroService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> findById( @PathVariable Integer id ) {
		Livro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
