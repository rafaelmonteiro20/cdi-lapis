package com.lapis.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lapis.model.Funcionario;

public class Folha {

	private double valor;
	
	private Date data;
	
	private List<Funcionario> funcionarios;
	

	public Folha(Date data, double valor, List<Funcionario> funcionarios) {
		this.data = data;
		this.valor = valor;
		this.funcionarios = new ArrayList<>(funcionarios);
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
}