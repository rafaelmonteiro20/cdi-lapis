package com.lapis.service.usuario;

import java.io.Serializable;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.lapis.dao.UsuarioDAO;
import com.lapis.model.Usuario;

public class UsuarioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject @Contratacao
	private Event<Usuario> eventoUsuarioCriado;
	
	@Inject @Demissao
	private Event<Usuario> eventoUsuarioDemitido;
	
	
	public void cadastrar(Usuario usuario){
		usuario.ativar();
		usuarioDAO.salvar(usuario);
		
		eventoUsuarioCriado.fire(usuario);
	}
	
	public void demitir(Usuario usuario) {
		usuario.desativar();
		
		eventoUsuarioDemitido.fire(usuario);
	}
	
}