package com.br.saojudas;

public class Retangulo extends Poligono implements Diagonal{

	@Override
	public Double calculaDiagonal() throws Exception {
		if(this.getBase() == null || this.getAltura() == null) 
			throw new Exception("Não foi possivel calcular a area");
		
		
		Double diagonal = Math.sqrt((Math.pow(this.getBase(), this.getBase()) 
				+ Math.pow(this.getAltura(), this.getAltura())));
		
		return diagonal;
	}	
}

