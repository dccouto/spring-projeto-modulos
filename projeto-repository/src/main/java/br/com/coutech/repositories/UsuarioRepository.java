package br.com.coutech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.coutech.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
