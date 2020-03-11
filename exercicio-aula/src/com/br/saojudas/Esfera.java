package com.br.saojudas;

public class Esfera extends Poligono3D {
	
	private Double raio;

	public Esfera() {
		
	}
	
	public Esfera(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double volume() {
		return (4 * Math.PI * Math.pow(this.getRaio(), 3) / 3);
	}
}
