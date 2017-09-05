package com.lapis.service.simulador;

import java.util.List;

import com.lapis.model.Funcionario;
import com.lapis.model.PlanoDeCargos;
import com.lapis.service.CalculadoraFolhaPagamento;
import com.lapis.service.Folha;

@Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
public class SimuladorCalculadoraFolhaPagamento2013 implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulador 2013...");
		return null;
	}

}