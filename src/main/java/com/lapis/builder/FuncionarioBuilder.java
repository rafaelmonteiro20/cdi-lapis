package com.lapis.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.lapis.model.Cargo;
import com.lapis.model.Funcionario;

public class FuncionarioBuilder {

	private Funcionario funcionario;
	
	public FuncionarioBuilder() {
		this.funcionario = new Funcionario();
	}
	
	public FuncionarioBuilder comNome(String nome) {
		this.funcionario.setNome(nome);
		return this;
	}
	
	public FuncionarioBuilder comSalarioBaseDe(double salario) {
		Cargo cargo = new Cargo("Programador", salario);
		this.funcionario.setCargo(cargo);
		return this;
	}
	
	public FuncionarioBuilder admitidoEm(String data) {
		LocalDate dataAdmissao = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.funcionario.setDataAdmissao(dataAdmissao);
		return this;
	}
	
	public Funcionario build() {
		return funcionario;
	}
	
}