package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCCCTest {
	private CalculadoraCCC elemento;
	private static double DELTA = 0.05;

	@BeforeEach
	public void setUp() {
		elemento = new CalculadoraCCC();
	}
	
	
	@Test
	public void testaResultadoNiobio() {
		double peso = 92.91;
		double raio = 0.143;
		elemento.calcula(peso, raio);
		assertEquals(8.57, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoLitio() {
		double peso = 6.94;
		double raio = 0.152;
		elemento.calcula(peso, raio);
		assertEquals(0.53, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoTungstenio() {
		double peso = 183.84;
		double raio = 0.137;
		elemento.calcula(peso, raio);
		assertEquals(19.28, elemento.calcula(peso, raio), DELTA);
	}

}
