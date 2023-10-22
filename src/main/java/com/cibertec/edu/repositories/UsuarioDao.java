package com.cibertec.edu.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cibertec.edu.models.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
	public List<Usuario> findAll();

	public Optional<Usuario> findById(Long id);
}
