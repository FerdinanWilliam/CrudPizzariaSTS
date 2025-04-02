package br.itb.projeto.pizzaria3b.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itb.projeto.pizzaria3b.model.entity.Mensagem;
import br.itb.projeto.pizzaria3b.service.MensagemService;

@RestController
@RequestMapping("/mensagem")
public class MensagemController {
	
	private MensagemService mensagemService; 
	// Source => Generate Constructor using Fields...

	public MensagemController(MensagemService mensagemService) {
		super();
		this.mensagemService = mensagemService;
	}
	
	@GetMapping("/test")
	public String getTest() {
		return "Olá, Mensagem!";
	}
	
	@GetMapping("/findById/{id}")
	public ResponseEntity<Mensagem> findById(@PathVariable long id){
		
		Mensagem mensagem = mensagemService.findById(id);
		return new ResponseEntity<Mensagem>(mensagem, HttpStatus.OK);
		
	}

}
