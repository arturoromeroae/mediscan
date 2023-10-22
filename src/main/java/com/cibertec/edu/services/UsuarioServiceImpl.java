package com.cibertec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cibertec.edu.models.Usuario;
import com.cibertec.edu.repositories.UsuarioDao;

public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDao userRepository;

	@Override
	public List<Usuario> getAllUsers() {
		// TODO Auto-generated method stub
		return this.userRepository.findAll();
	}

	@Override
	public Usuario getOneUser(Long id) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuario = this.userRepository.findById(id);
		if(usuario.isPresent())
			return usuario.get();
		return null;
	}
}
