package com.learning.learning.exercises;

public class Persona implements Comparable<Persona> {

	private String name;
	private int edad;
	
	public Persona(String name, int edad) {
		super();
		this.name = name;
		this.edad = edad;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public final void metodoFinal() {
		System.out.println("metodo final");
	}
	
	public static void metodoStatic() {
		System.out.println("metodo estatico");
	}
	
	public void metodoNormal() {
		System.out.println("Metodo normal");
	}
	@Override
	public int compareTo(Persona o) { 
		return this.edad - o.getEdad();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
