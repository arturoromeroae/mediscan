package com.cibertec.edu.Mediscan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cibertec.edu.Mediscan.models.*;
import com.cibertec.edu.Mediscan.repositories.*;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	@Autowired
	private IUsuarioRepository usuario;
	
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
