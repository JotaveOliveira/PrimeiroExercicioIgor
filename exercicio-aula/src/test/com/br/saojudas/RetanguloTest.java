package com.br.saojudas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RetanguloTest {

	Retangulo retangulo = new Retangulo();

	@Test
	public void calculaAreaSucess() throws Exception {

		retangulo.setBase(Double.parseDouble("10"));
		retangulo.setAltura(Double.parseDouble("20"));
		Double areaCalculada = retangulo.area();

		assertNotNull(areaCalculada);
		assertEquals(new Double(200.0), areaCalculada);
	}

	@Test(expected = Exception.class)
	public void calculaAreaNoSucess() throws Exception {

		retangulo.setBase(null);
		retangulo.setAltura(null);
		Double areaCalculada = retangulo.area();

		assertNotNull(areaCalculada);
		assertEquals("Não foi possivel calcular a area", areaCalculada);
	}

	@Test(expected = NumberFormatException.class)
	public void calculaAreaIsEmptyNoSucess() throws Exception {

		retangulo.setBase(Double.parseDouble(""));
		retangulo.setAltura(Double.parseDouble(""));
		Double areaCalculada = retangulo.area();

		assertNotNull(areaCalculada);
	}

	@Test
	public void calculaDiagonalSucess() throws Exception {

		retangulo.setBase(Double.parseDouble("30"));

		Double diagonalQuadrado = retangulo.calculaDiagonal();

		assertNotNull(diagonalQuadrado);
		assertEquals(new Double(42.42640687119285), diagonalQuadrado);
	}

	@Test(expected = Exception.class)
	public void calculaDiagonalIsEmptyNoSucess() throws Exception {

		retangulo.setBase(null);

		Double diagonalQuadrado = retangulo.calculaDiagonal();

		assertNotNull(diagonalQuadrado);
		assertEquals("Não foi possivel calcular a diagonal", diagonalQuadrado);
	}
}
