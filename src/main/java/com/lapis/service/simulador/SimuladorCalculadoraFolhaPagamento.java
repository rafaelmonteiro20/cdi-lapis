package com.lapis.service.simulador;

import java.util.Date;
import java.util.List;

import com.lapis.model.Funcionario;
import com.lapis.service.CalculadoraFolhaPagamento;
import com.lapis.service.Folha;

@Simulador
public class SimuladorCalculadoraFolhaPagamento implements CalculadoraFolhaPagamento {

	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		System.out.println("Simulador...");
		return new Folha(new Date(), 1000.0, funcionarios);
	}

}
