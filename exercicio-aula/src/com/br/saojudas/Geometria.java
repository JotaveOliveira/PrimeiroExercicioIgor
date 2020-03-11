package com.br.saojudas;

import java.util.ArrayList;
import java.util.List;

public class Geometria {
	
	private List<Figura> listaFiguras = new ArrayList<>();

	public Geometria() {
		Circulo circulo = new Circulo(7.0);
		Triangulo triangulo = new Triangulo(new Double(3.0),new Double(2.0));
		Quadrado quadrado = new Quadrado(new Double(3.0), new Double(2.0));
		listaFiguras.add(circulo);
		listaFiguras.add(triangulo);
		listaFiguras.add(quadrado);
		
	}
	public Geometria(List<Figura> listaFiguras) {
		this.listaFiguras = listaFiguras;
	}
}
