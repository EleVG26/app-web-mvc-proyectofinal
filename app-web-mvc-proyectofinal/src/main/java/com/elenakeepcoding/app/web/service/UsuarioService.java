package com.elenakeepcoding.app.web.service;

import java.util.List;

import com.elenakeepcoding.app.web.entity.Usuario;

public interface UsuarioService {
	public List<Usuario> listaUsuarios();
	
	public Usuario guardarUsuario(Usuario usuario);
	
	public Usuario obtenerUsuarioPorID(Long id);
	
	public Usuario obtenerUsuarioPorUsernameYPassword(String username, String password);

    public void eliminarUsuario(Long id);
    
    boolean existeUsuarioPorUsername(String username);

}
