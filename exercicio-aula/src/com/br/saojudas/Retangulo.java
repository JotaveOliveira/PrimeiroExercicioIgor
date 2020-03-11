package com.br.saojudas;

public class Retangulo extends Poligono implements Diagonal{

	@Override
	public Double calculaDiagonal() {
		
		Double diagonal = Math.sqrt((Math.pow(this.getBase(), this.getBase()) 
				+ Math.pow(this.getAltura(), this.getAltura())));
		
		return diagonal;
	}	
}
