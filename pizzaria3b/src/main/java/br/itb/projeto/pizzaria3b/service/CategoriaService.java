package br.itb.projeto.pizzaria3b.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3b.model.entity.Categoria;
import br.itb.projeto.pizzaria3b.model.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	private CategoriaRepository categoriaRepository; 
	// Source => Generate Constructor using Fields... 
	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}
	
	public Categoria findById(long id) {
		Categoria categoria = categoriaRepository.findById(id).orElseThrow();
		return categoria;
	}
	
}
