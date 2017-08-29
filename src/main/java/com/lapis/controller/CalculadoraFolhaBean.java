package com.lapis.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.lapis.builder.FuncionarioBuilder;
import com.lapis.model.Funcionario;
import com.lapis.service.CalculadoraFolhaPagamento;
import com.lapis.service.Folha;

@Named
@ConversationScoped
public class CalculadoraFolhaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Conversation conversation;
	
	@Inject
	private CalculadoraFolhaPagamento calculadoraFolha;
	
	private Folha folha;
	
	private List<Funcionario> funcionarios;
	
	private double salarioFuncionario;
	
	@PostConstruct
	public void init(){
		funcionarios = new ArrayList<>();
	}
	
	public void iniciaConversacao(){
		if(conversation.isTransient()){
			conversation.begin();
		}
	}
	
	public void terminaConversacao(){
		if(!conversation.isTransient()){
			conversation.end();
		}
	}
	
	public void adicionaFuncionario(){
		Funcionario funcionario = new FuncionarioBuilder()
						.comSalarioBaseDe(salarioFuncionario)
						.admitidoEm("26/09/2016")
						.build();
		
		funcionarios.add(funcionario);
	}
	
	public void calcularFolha(){
		this.folha = calculadoraFolha.calculaFolha(funcionarios);
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}
	
	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
	public Folha getFolha() {
		return folha;
	}
	
}