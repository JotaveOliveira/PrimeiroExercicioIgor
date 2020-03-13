package com.br.saojudas;

public class Quadrado extends Poligono implements Diagonal{
	
	private Double lado;
	
	public Quadrado() {
		
	}
	public Quadrado(Double lado) {
		this.lado = lado;
	}

	public Quadrado(Double base, Double altura) {
		this.setAltura(altura);
		this.setBase(base);
	}
	public Double getLado() {
		return lado;
	}
	public void setLado(Double lado) {
		this.lado = lado;
	}
	
	@Override
	public Double calculaDiagonal() throws Exception {
		if(this.lado == null) 
			throw new Exception("Não foi possivel calcular a diagonal");
		
		return  this.lado * Math.sqrt(2);
	}

}
