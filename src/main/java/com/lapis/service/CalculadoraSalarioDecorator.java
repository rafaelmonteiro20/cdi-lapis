package com.lapis.service;

import java.io.Serializable;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import com.lapis.model.Funcionario;

@Decorator @Priority(2002)
public class CalculadoraSalarioDecorator implements 
							CalculadoraDeSalario, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject @Delegate
	private CalculadoraDeSalario delegate;

	@Override
	public double calcular(Funcionario funcionario) {
		System.out.println("Adicionando algo antes..");
	
		double result = delegate.calcular(funcionario);
		
		System.out.println("FIM");
		
		result *= 1.1;
		
		return result + 100;
	}

}