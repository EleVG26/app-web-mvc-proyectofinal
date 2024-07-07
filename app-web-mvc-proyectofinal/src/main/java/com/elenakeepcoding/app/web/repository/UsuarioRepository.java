package com.elenakeepcoding.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elenakeepcoding.app.web.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByUsername(String username);
	Usuario findByUsernameAndPassword(String username, String password);
	

}
