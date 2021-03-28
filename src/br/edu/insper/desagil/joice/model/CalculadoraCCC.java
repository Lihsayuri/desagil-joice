package br.edu.insper.desagil.joice.model;
import java.lang.Math;

public class CalculadoraCCC extends Calculadora{	

	public CalculadoraCCC() {
		super("CCC");
	}

	@Override
	public double calcula(double peso, double raio) {
		double massa;
		double volume;
		double densidade;
		
		massa = (2*peso)/(6.02*Math.pow(10, 23));
		volume = Math.pow((4*raio*Math.pow(10,-7))/(Math.sqrt(3)), 3);

		densidade = massa/ volume;
	
		return densidade;
	}

}