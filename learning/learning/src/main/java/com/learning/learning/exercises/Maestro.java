package com.learning.learning.exercises;

public class Maestro extends Persona {

	public Maestro(String name, int edad) {
		super(name, edad);
	}



	private String materia;
	
	
	
	public String getMateria() {
		return materia;
	}



	public void setMateria(String materia) {
		this.materia = materia;
	}



	@Override
	public void metodoNormal() {
		System.out.println("Metodo normal maestro");
		super.metodoNormal();
	}
	
	
	
}
