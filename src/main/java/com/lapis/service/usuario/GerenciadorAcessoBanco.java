package com.lapis.service.usuario;

import javax.enterprise.event.Observes;

import com.lapis.model.Usuario;

public class GerenciadorAcessoBanco {

	public void criar(@Observes @Contratacao Usuario usuario) {
		System.out.println("Criando usuário no banco de teste...");
		System.out.println(usuario.getNome());
	}
	
}
