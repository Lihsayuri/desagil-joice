package br.edu.insper.desagil.joice.model;
import java.lang.Math;

public class CalculadoraCFC extends Calculadora{
	
	public CalculadoraCFC() {
		super("CFC");
	}
	
	@Override
	public double calcula(double peso, double raio) {
		double massa;
		double volume;
		double densidade;
		
		massa = (4*peso)/(6.02*Math.pow(10, 23));
		volume = (16*Math.sqrt(2)*Math.pow(raio*Math.pow(10, -7),3));
		
		densidade = massa/ volume;
	
		return densidade;
	}
}