package br.itb.projeto.pizzaria3b.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3b.model.entity.Promocao;
import br.itb.projeto.pizzaria3b.model.entity.Usuario;
import br.itb.projeto.pizzaria3b.model.repository.PromocaoRepository;
import br.itb.projeto.pizzaria3b.model.repository.UsuarioRepository;

@Service
public class PromocaoService {

	private PromocaoRepository promocaoRepository; 
	private UsuarioRepository usuarioRepository;
	// Source => Generate Constructor using Fields...
	public PromocaoService(PromocaoRepository promocaoRepository, UsuarioRepository usuarioRepository) {
		super();
		this.promocaoRepository = promocaoRepository;
		this.usuarioRepository = usuarioRepository;
	}
	
	public Promocao findById(long id) {
		Promocao promocao = promocaoRepository.findById(id).orElseThrow();
		return promocao;
	}
	
	public Usuario findById1(long id) {
		Usuario usuario = usuarioRepository.findById(id).orElseThrow();
		return usuario;
	}
}
