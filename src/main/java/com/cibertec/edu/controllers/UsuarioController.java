package com.cibertec.edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.edu.models.Usuario;
import com.cibertec.edu.repositories.IUsuario;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	private IUsuario usuario;
	
	@GetMapping
	public List<Usuario> listar() {
		return usuario.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> buscar(@PathVariable("id") int id) {
		return usuario.findById(id)
				.map(ResponseEntity::ok)
	            .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public void insertar(@RequestBody Usuario a) {
		usuario.save(a);
	}
	
	@PutMapping
	public void modificar(@RequestBody Usuario a) {
		usuario.save(a);
	}
	
	@DeleteMapping(value = "/{id}")
	public void suprimir(@PathVariable("id") int id) {
		usuario.deleteById(id);
	}
}
