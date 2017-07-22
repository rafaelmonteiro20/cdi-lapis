package com.lapis.service;

import java.time.Year;

import com.lapis.model.Funcionario;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {
		double salario = funcionario.getCargo().getSalarioBase();
		
		int anoAtual = getAnoAtual();
		int anoAdmissao = funcionario.getAnoAdmissao();
		
		//dá 1% de aumento para cada ano trabalhado na empresa
		double anosTrabalhados = anoAtual - anoAdmissao;
		double aumentoAntiguidade = anosTrabalhados / 100;
		
		salario = salario * (1 + aumentoAntiguidade);
		
		//se tem mais de 5 anos na empresa tem aumento de 10%
		if(anosTrabalhados > 5){
			salario = salario * 1.1;
		}
		
		return salario;
	}
	
	private int getAnoAtual() {
		return Year.now().getValue();
	}
	
}