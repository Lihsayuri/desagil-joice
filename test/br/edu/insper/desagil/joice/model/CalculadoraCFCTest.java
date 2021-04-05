package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraCFCTest {
	private CalculadoraCFC elemento;
	private static double DELTA = 0.05;

	@BeforeEach
	public void setUp() {
		elemento = new CalculadoraCFC();
	}
	
	
	@Test
	public void testaResultadoCobre() {
		double peso = 63.55;
		double raio = 0.128;
		elemento.calcula(peso, raio);
		assertEquals(8.89, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoOuro() {
		double peso = 196.97;
		double raio = 0.144;
		elemento.calcula(peso, raio);
		assertEquals(19.36, elemento.calcula(peso, raio), DELTA);
	}
	
	@Test
	public void testaResultadoPrata() {
		double peso = 107.87;
		double raio = 0.144;
		elemento.calcula(peso, raio);
		assertEquals(10.60, elemento.calcula(peso, raio), DELTA);
	}
	

}
