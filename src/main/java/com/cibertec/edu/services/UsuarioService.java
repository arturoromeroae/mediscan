package com.cibertec.edu.services;

import java.util.List;

import com.cibertec.edu.models.Usuario;

public interface UsuarioService {
	public List<Usuario> getAllUsers();
	public Usuario getOneUser(Long id);
}
