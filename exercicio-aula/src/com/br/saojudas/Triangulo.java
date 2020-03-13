package com.br.saojudas;

public class Triangulo extends Poligono {
	
	public Triangulo() {
		
	}

	public Triangulo(Double base, Double altura) {
		this.setAltura(altura);
		this.setBase(base);
	}

	@Override
	public Double area() throws Exception { 
		if(this.getAltura() == null || this.getBase() == null)
			throw new Exception("Não foi possivel calcular a area");
		
		return (this.getAltura() * this.getBase())/ 2;	
	}
}
