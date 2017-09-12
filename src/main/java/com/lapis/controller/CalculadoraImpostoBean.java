package com.lapis.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.lapis.builder.FuncionarioBuilder;
import com.lapis.model.Funcionario;
import com.lapis.service.CalculadoraDeImposto;

@Named
@RequestScoped
public class CalculadoraImpostoBean {

	@Inject
	private CalculadoraDeImposto calculadora;
	
	private double salarioBase;
	
	private double imposto;
	
	
	public void calcular() {
		Funcionario funcionario = new FuncionarioBuilder()
										.comNome("Josimar")
										.admitidoEm("26/06/2017")
										.comSalarioBaseDe(salarioBase)
										.build();
		
		this.imposto = calculadora.calcular(funcionario);
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
}