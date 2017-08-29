package com.lapis.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.lapis.model.Usuario;

public class UsuarioDAO {

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional
	public void salvar(Usuario usuario) {
		manager.merge(usuario);
	}
	
}