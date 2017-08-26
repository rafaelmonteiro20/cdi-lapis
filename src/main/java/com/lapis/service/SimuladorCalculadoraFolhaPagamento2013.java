package com.lapis.service;

import java.util.List;

import com.lapis.model.Funcionario;
import com.lapis.model.PlanoDeCargos;

@Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
public class SimuladorCalculadoraFolhaPagamento2013 implements CalculadoraFolhaPagamento {

	@Override
	public void calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulador...");
	}

}
