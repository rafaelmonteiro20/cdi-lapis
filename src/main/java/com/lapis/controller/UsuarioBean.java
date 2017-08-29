package com.lapis.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.lapis.dao.UsuarioDAO;
import com.lapis.model.Usuario;
import com.lapis.util.MessagesHelper;

@Named
@RequestScoped
public class UsuarioBean {

	@Inject
	private UsuarioDAO usuarioDAO;
	
	@Inject
	private MessagesHelper helper;
	
	private Usuario usuario;
	
	@PostConstruct
	public void init() {
		novo();
	}
	
	public void salvar() {
		usuarioDAO.salvar(usuario);
		helper.addInfoMessage("Usuário salvo com sucesso!");
		novo();
	}
	
	private void novo() {
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
}