package com.lapis.model;

public class Cargo {

	private String descricao;
	
	private double salarioBase;

	public Cargo(String descricao, double salarioBase) {
		this.descricao = descricao;
		this.salarioBase = salarioBase;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
}