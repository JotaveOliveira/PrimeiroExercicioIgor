package com.br.saojudas;

public class Triangulo extends Poligono {

	public Triangulo(Double base, Double altura) {
		this.setAltura(altura);
		this.setBase(base);
	}

	@Override
	public Double area() { 
		return (this.getAltura() * this.getBase())/ 2;	
	}
}
