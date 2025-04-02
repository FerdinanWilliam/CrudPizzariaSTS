package br.itb.projeto.pizzaria3b.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3b.model.entity.Categoria;
import br.itb.projeto.pizzaria3b.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	private CategoriaService categoriaService; 
	// Source => Generate Constructor using Fields...

	public CategoriaController(CategoriaService categoriaService) {
		super();
		this.categoriaService = categoriaService;
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "Olá, Categoria!";
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable long id){
	
		Categoria categoria = categoriaService.findById(id);
		return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);
	
	}

}
