package br.itb.projeto.pizzaria3b.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3b.model.entity.Mensagem;
import br.itb.projeto.pizzaria3b.model.repository.MensagemRepository;

@Service
public class MensagemService {

	private MensagemRepository mensagemRepository;
	// Source => Generate Constructor using Fields...
	public MensagemService(MensagemRepository mensagemRepository) {
		super();
		this.mensagemRepository = mensagemRepository;
	}
	
	public Mensagem findById(long id) {
		Mensagem mensagem = mensagemRepository.findById(id).orElseThrow();
		return mensagem;
	}
}
