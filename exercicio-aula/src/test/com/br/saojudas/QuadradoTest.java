package com.br.saojudas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class QuadradoTest {

	Quadrado quadrado = new Quadrado();

	@Test
	public void calculaAreaSucess() throws Exception {

		quadrado.setBase(Double.parseDouble("10"));
		quadrado.setAltura(Double.parseDouble("20"));
		Double areaCalculada = quadrado.area();

		assertNotNull(areaCalculada);
		assertEquals(new Double(200.0), areaCalculada);
	}

	@Test(expected = Exception.class)
	public void calculaAreaNoSucess() throws Exception {

		quadrado.setBase(null);
		quadrado.setAltura(null);
		Double areaCalculada = quadrado.area();

		assertNotNull(areaCalculada);
		assertEquals("Não foi possivel calcular a area", areaCalculada);
	}

	@Test(expected = NumberFormatException.class)
	public void calculaAreaIsEmptyNoSucess() throws Exception {

		quadrado.setBase(Double.parseDouble(""));
		quadrado.setAltura(Double.parseDouble(""));
		Double areaCalculada = quadrado.area();

		assertNotNull(areaCalculada);
	}

	@Test
	public void calculaDiagonalSucess() throws Exception {

		quadrado.setLado(Double.parseDouble("30"));

		Double diagonalQuadrado = quadrado.calculaDiagonal();

		assertNotNull(diagonalQuadrado);
		assertEquals(new Double(42.42640687119285), diagonalQuadrado);
	}

	@Test(expected = Exception.class)
	public void calculaDiagonalNoSucess() throws Exception {

		quadrado.setLado(null);

		Double diagonalQuadrado = quadrado.calculaDiagonal();

		assertNotNull(diagonalQuadrado);
		assertEquals("Não foi possivel calcular a diagonal", diagonalQuadrado);
	}
}
