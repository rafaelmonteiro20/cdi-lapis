package com.lapis.service.usuario;

import javax.enterprise.event.Observes;

import com.lapis.model.Usuario;

public class GerenciadorAcessoGIT {

	
	public void criarUsuario(@Observes @Contratacao Usuario usuario) {
		System.out.println("Criando usuário no GIT..");
	}
	
	public void desativarUsuario(@Observes @Demissao Usuario usuario) {
		System.out.println("Usuário desativado do GIT..");
	}
	
	public void executaAlgo(@Observes Usuario usuario) {
		System.out.println("Executando algo..");
	}

}