package com.br.saojudas;

public abstract class Poligono extends Figura{
	
	private Double base;
	
	private Double altura;
	
	public Poligono() {
		
	}
	public Poligono(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
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
	
	@Override
	public Double area() throws Exception {
		if(this.base == null || this.altura == null) 
			throw new Exception("N�o foi possivel calcular a area");
		
		return this.base * this.altura;
	}
}
