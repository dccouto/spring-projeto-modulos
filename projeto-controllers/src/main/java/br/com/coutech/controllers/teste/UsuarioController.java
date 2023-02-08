package br.com.coutech.controllers.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coutech.entities.Usuario;
import br.com.coutech.services.UsuarioService;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioNovo(@PathVariable Long id){
        return ResponseEntity.ok(usuarioService.getUsuarioById(id));
    }
    
    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
    	return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvar(usuario));
    }
}
