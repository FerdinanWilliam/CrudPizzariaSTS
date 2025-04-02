package br.itb.projeto.pizzaria3b.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3b.model.entity.Produto;
import br.itb.projeto.pizzaria3b.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	private ProdutoService produtoService; 
	// Source => Generate Constructor using Fields...

	public ProdutoController(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "Olá, Produto!";
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Produto> findById(@PathVariable long id){
		
		Produto produto = produtoService.findById(id);
		return new ResponseEntity<Produto>(produto, HttpStatus.OK);
		
	}

}
