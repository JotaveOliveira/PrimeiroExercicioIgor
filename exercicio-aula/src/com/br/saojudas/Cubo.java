package com.br.saojudas;

public class Cubo extends Poligono3D{

	@Override
	public Double volume() {
		return Math.pow(this.getBase(), 3);
	}
	
}
