package br.itb.projeto.pizzaria3b.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3b.model.entity.Promocao;
import br.itb.projeto.pizzaria3b.service.PromocaoService;

@RestController
@RequestMapping("/promocao")
public class PromocaoController {
	
	private PromocaoService promocaoService; 
	// Source => Generate Constructor using Fields...

	public PromocaoController(PromocaoService promocaoService) {
		super();
		this.promocaoService = promocaoService;
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "Olá, Promocao!";
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<Promocao> findById(@PathVariable long id){
		
		Promocao promocao = promocaoService.findById(id);
		return new ResponseEntity<Promocao>(promocao, HttpStatus.OK);
		
	}
}
