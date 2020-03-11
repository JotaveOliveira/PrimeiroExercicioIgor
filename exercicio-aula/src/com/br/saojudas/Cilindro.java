package com.br.saojudas;

public class Cilindro extends Poligono3D{
	
	private Double raio;
	
	public Cilindro() {
	}

	public Cilindro(Double raio) {
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
		return (Math.PI * Math.pow(raio, 2)) * this.getAltura();
	}
}
