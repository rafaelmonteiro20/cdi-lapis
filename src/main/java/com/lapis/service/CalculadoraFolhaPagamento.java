package com.lapis.service;

import java.util.List;

import com.lapis.model.Funcionario;

public interface CalculadoraFolhaPagamento {

	Folha calculaFolha(List<Funcionario> funcionarios);
	
}