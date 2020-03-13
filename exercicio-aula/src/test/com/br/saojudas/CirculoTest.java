package com.br.saojudas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CirculoTest {

	Circulo circulo = new Circulo();
	
	@Test
	public void calculaAreaSucess() throws Exception {

		circulo.setRaio(Double.parseDouble("2"));
		Double areaCalculada = circulo.area();

		assertNotNull(areaCalculada);
		assertEquals(new Double(12.566370614359172), areaCalculada);
	}
	
	@Test(expected = Exception.class)
	public void calculaAreaNoSucess() throws Exception {

		circulo.setRaio(null);
		Double areaCalculada = circulo.area();

		assertNotNull(areaCalculada);
		assertEquals("Não foi possivel calcular o a area", areaCalculada);
	}
	
	@Test(expected = NumberFormatException.class)
	public void calculaAreaIsEmptyNoSucess() throws Exception {

		circulo.setRaio(Double.parseDouble(""));

		Double areaCalculada = circulo.area();

		assertNotNull(areaCalculada);
	}
}
