package br.itb.projeto.pizzaria3b.service;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3b.model.entity.Usuario;
import br.itb.projeto.pizzaria3b.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository usuarioRepository;
	// Source => Generate Constructor using Fields...
	public UsuarioService(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	
	public Usuario findById(long id) {
		Usuario usuario = usuarioRepository.findById(id).orElseThrow();
		return usuario;
	}
}
