package com.lapis.service;

import java.util.List;

import com.lapis.model.Funcionario;


public class CalculadoraFolhaPagamentoReal implements CalculadoraFolhaPagamento {

	@Override
	public void calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Efetuando o cálculo real da folha de pagamento...");
	}

}