package com.lapis.service;

import java.util.List;

import com.lapis.model.Funcionario;

@Simulador
public class SimuladorCalculadoraFolhaPagamento implements CalculadoraFolhaPagamento {

	@Override
	public void calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulador...");
	}

}
