package com.cibertec.edu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cibertec.edu.models.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
