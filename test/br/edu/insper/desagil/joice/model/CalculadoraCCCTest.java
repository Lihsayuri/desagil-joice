package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private Calculadora elemento;
	private double peso;
	private double raio;
	private static double DELTA = 0.05;

	@Test
	public void testaResultadoNiobio() {
		elemento = new CalculadoraCCC("Níobio");
		peso = 92.91;
		raio = 0.143;
		elemento.calcula(peso, raio);
		assertEquals(8.57, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoLitio() {
		elemento = new CalculadoraCCC("Lítio");
		peso = 6.94;
		raio = 0.152;
		elemento.calcula(peso, raio);
		assertEquals(0.53, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoTungstenio() {
		elemento = new CalculadoraCCC("Tungstênio");
		peso = 183.84;
		raio = 0.137;
		elemento.calcula(peso, raio);
		assertEquals(19.28, elemento.calcula(peso, raio), DELTA);
	}

}
