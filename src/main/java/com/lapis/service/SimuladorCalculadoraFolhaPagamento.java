package com.lapis.service;

import java.util.Date;
import java.util.List;

import com.lapis.model.Funcionario;

@Simulador
public class SimuladorCalculadoraFolhaPagamento implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulador...");
		return new Folha(new Date(), 1000.0, funcionarios);
	}

}
