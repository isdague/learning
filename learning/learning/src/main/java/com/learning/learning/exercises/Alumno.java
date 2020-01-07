package com.learning.learning.exercises;

public class Alumno extends Persona {

	public Alumno(String name, int edad) {
		super(name, edad);
	}

	private int grado;

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}
	
	
	
}
