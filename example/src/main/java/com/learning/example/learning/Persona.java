package com.learning.example.learning;

public class Persona {

	private String nombre;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void metodoSencillo() {
		System.out.println("Metodo sencillo");
	}
	public static void metodoStatic() {
		System.out.println("Metodo estatico");
	}
}
