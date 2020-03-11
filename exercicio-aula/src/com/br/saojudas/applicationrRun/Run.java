package com.br.saojudas.applicationrRun;

public class Run {

	public static void main(String[] args) {
		Double x = Double.parseDouble("125");
		Double resultado = Double.parseDouble("0");
		Integer base = 1;
		Integer var = 0;

		do {
			base++;
			var = 0;
			do {
				var++;
				resultado = Math.pow(base, var);
			} while (resultado < x);
			
		} while (resultado != x);

		System.out.print("Base = " + base + " Expoente = " + var + " Resultado = " + resultado);
	}
}
