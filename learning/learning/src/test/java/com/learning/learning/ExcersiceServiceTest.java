package com.learning.learning;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.learning.learning.exercises.ExersiceService;

public class ExcersiceServiceTest {
	
	ExersiceService exersiceService;
	
	@Before
	private void before() {
		exersiceService = new ExersiceService();
	}

	@Test
	public void pruebaConcatenar() {

		String resultado = exersiceService.concatenar("Israel", "Davila");
		String esperado = "Israel Davila";
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void pruebaSumar() {
		
		int actual = exersiceService.sumar(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
		
	}

	@Test
	public void pruebaMultiplicar() {
	
		int actual = ExersiceService.multiplicar(5, 5);
		int expected = 25;
		assertEquals(expected, actual);
		
	}
	
}
