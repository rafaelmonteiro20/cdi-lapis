package com.lapis.model;

import java.time.LocalDate;

public class Funcionario {

	private String nome;
	
	private Cargo cargo;
	
	private LocalDate dataAdmissao;

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cargo getCargo() {
		return cargo;
	}
	
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}
	
	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public int getAnoAdmissao() {
		return dataAdmissao.getYear();
	}
	
}