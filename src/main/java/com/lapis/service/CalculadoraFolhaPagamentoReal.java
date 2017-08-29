package com.lapis.service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import com.lapis.model.Funcionario;

@Dependent
public class CalculadoraFolhaPagamentoReal implements 
							CalculadoraFolhaPagamento, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraDeSalario calculadoraSalario;

	
	@Override
	public Folha calculaFolha(List<Funcionario> funcionarios) {
		double valor = 0.0;
		
		for (Funcionario funcionario : funcionarios) {
			valor += calculadoraSalario.calcular(funcionario);
		}
		
		return new Folha(new Date(), valor, funcionarios);
	}

}