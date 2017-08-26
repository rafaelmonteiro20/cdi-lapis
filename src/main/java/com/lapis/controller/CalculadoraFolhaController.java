package com.lapis.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lapis.model.Funcionario;
import com.lapis.model.PlanoDeCargos;
import com.lapis.service.CalculadoraFolhaPagamento;
import com.lapis.service.Simulador;

@WebServlet("/calculadora-folha")
public class CalculadoraFolhaController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject @Simulador(planoDeCargos = PlanoDeCargos.VERSAO_2013)
	private CalculadoraFolhaPagamento calculadora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		calculadora.calculaFolha(Arrays.asList(f1, f2, f3));
		
		PrintWriter out = resp.getWriter();
		
		out.println("Cálculo da folha executado com sucesso!");
		out.println("Class: " + calculadora.getClass().getName());
	}
	
}