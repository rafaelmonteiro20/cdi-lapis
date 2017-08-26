package com.lapis.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.lapis.builder.FuncionarioBuilder;
import com.lapis.model.Funcionario;

public class CalculadoraDeImpostoTest {

	@Test
	public void deveCalcularIRNaSegundaFaixaDeContribuicao() {
		Funcionario funcionario = new FuncionarioBuilder()
										.comNome("Josimar Júnior")
										.admitidoEm("08/06/2017")
										.comSalarioBaseDe(3000.0)
										.build();
		
		CalculadoraDeSalario mock = Mockito.mock(CalculadoraDeSalario2005.class);
		Mockito.when(mock.calcular(funcionario)).thenReturn(3000.0);
		
		CalculadoraDeImposto calcImposto = new CalculadoraDeImposto(mock);
		
		double imposto = calcImposto.calcular(funcionario);
		assertEquals(129.4, imposto, 0.0001);
	}
	
}