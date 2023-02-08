package br.com.coutech.services;

import org.springframework.stereotype.Service;

import br.com.coutech.entities.Usuario;
import br.com.coutech.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class UsuarioService {

	private final UsuarioRepository usuarioRepository;

	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findById(id).orElseThrow(()-> new RuntimeException("Não localizado"));
	}

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
