package com.br.saojudas;

public class Circulo extends Figura {
	
	private Double raio;
	
	public Circulo() {
		
	}
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return (this.raio * this.raio)* Math.PI;
		
	}
	
}
