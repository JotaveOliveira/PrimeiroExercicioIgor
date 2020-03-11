package com.br.saojudas;

public class Piramide extends Poligono3D {
	@Override
	public Double volume() {
		return ((this.getBase() * this.getAltura()) * this.getProfundidade()) / 3;
	}
}
