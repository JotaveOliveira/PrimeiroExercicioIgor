package com.br.saojudas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TrianguloTest {

	Triangulo triangulo = new Triangulo();
	
	@Test
	public void calculaAreaSucess() throws Exception {

		triangulo.setBase(Double.parseDouble("10"));
		triangulo.setAltura(Double.parseDouble("20"));
		Double areaCalculada = triangulo.area();

		assertNotNull(areaCalculada);
		assertEquals(new Double(100.0), areaCalculada);
	}
	
	@Test(expected = Exception.class)
	public void calculaAreaNoSucess() throws Exception {

		triangulo.setBase(null);
		triangulo.setAltura(null);
		Double areaCalculada = triangulo.area();

		assertNotNull(areaCalculada);
		assertEquals("Não foi possivel calcular a area", areaCalculada);
	}
	
	@Test(expected = NumberFormatException.class)
	public void calculaAreaIsEmptyNoSucess() throws Exception {

		triangulo.setBase(Double.parseDouble(""));
		triangulo.setAltura(Double.parseDouble(""));
		Double areaCalculada = triangulo.area();

		assertNotNull(areaCalculada);
	}
}
