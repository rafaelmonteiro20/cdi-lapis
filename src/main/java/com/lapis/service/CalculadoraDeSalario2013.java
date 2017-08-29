package com.lapis.service;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Alternative;

import com.lapis.model.Funcionario;

@Alternative
public class CalculadoraDeSalario2013 implements CalculadoraDeSalario {

	@PostConstruct
	public void init() {
		System.out.println("Calculadora de salário plano 2013...");
	}
	
	@Override
	public double calcular(Funcionario funcionario) {
		return 1000.0;
	}

}
