package com.lapis.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.lapis.model.Usuario;
import com.lapis.service.usuario.UsuarioService;
import com.lapis.util.MessagesHelper;

@Named
@RequestScoped
public class UsuarioBean {

	@Inject
	private UsuarioService service;
	
	@Inject
	private MessagesHelper helper;
	
	private Usuario usuario;
	
	@PostConstruct
	public void init() {
		novo();
	}
	
	public void salvar() {
		service.cadastrar(usuario);
		helper.addInfoMessage("Usuário salvo com sucesso!");
		novo();
	}
	
	public void demitir() {
		service.demitir(usuario);
		helper.addInfoMessage("Usuário desativado com sucesso!");
		novo();
	}
	
	private void novo() {
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
}