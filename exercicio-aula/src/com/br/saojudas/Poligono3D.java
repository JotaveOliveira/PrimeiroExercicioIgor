package com.br.saojudas;

public abstract class Poligono3D {
	
	private Double base;
	private Double altura;
	private Double profundidade;
	
	public Poligono3D() {
		
	}
	
	public Poligono3D(Double base, Double altura, Double profundidade) {
		this.base = base;
		this.altura = altura;
		this.profundidade = profundidade;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}

	public abstract Double volume();
}
