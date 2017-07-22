package com.lapis.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lapis.builder.FuncionarioBuilder;
import com.lapis.model.Funcionario;
import com.lapis.service.CalculadoraDeImposto;

@WebServlet("/calculadora")
public class CalculadoraController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CalculadoraDeImposto calculadora;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		

		double salarioBase = Double.parseDouble(req.getParameter("salario"));
		
		Funcionario funcionario = new FuncionarioBuilder()
										.comNome("Josimar Júnior")
										.admitidoEm("26/06/2017")
										.comSalarioBaseDe(salarioBase)
										.build();
		
		double imposto = calculadora.calcular(funcionario);
		
		PrintWriter out = resp.getWriter();
		out.print(String.format("Salario base: R$ %.2f\n" +
				"Imposto devido: R$ %.2f", salarioBase, imposto));
	}
	
}