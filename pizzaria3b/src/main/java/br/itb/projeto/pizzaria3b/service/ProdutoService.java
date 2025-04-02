package br.itb.projeto.pizzaria3b.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3b.model.entity.Categoria;
import br.itb.projeto.pizzaria3b.model.entity.Produto;
import br.itb.projeto.pizzaria3b.model.repository.CategoriaRepository;
import br.itb.projeto.pizzaria3b.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	private ProdutoRepository produtoRepository; 
	private CategoriaRepository categoriaRepository;
	// Source => Generate Constructor using Fields... 
	public ProdutoService(ProdutoRepository produtoRepository, CategoriaRepository categoriaRepository) {
		super();
		this.produtoRepository = produtoRepository;
		this.categoriaRepository = categoriaRepository;
	}
	
	public Produto findById(long id) {
		Produto produto = produtoRepository.findById(id).orElseThrow();
		return produto; 
	}
	
	public Categoria findById1(long id) {
		Categoria categoria = categoriaRepository.findById(id).orElseThrow();
		return categoria; 
	}
	
}
