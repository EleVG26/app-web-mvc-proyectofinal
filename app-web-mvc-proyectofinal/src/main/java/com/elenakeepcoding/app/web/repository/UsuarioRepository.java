package com.elenakeepcoding.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elenakeepcoding.app.web.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByUsernameAndPassword(String username, String password);

}
