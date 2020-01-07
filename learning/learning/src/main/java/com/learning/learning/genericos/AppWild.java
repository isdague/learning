package com.learning.learning.genericos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.learning.learning.exercises.Alumno;
import com.learning.learning.exercises.Persona;

public class AppWild {

	public void listar(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getName());
		}
	}
	
	public void listarLowerBounded(List<? super Alumno> list) {
		for (Object object : list) {
			System.out.println(((Persona)object).getName());
		}
	}

	public static void main(String[] args) {
		AppWild appWild = new AppWild();
		
		Alumno alumno = new Alumno("alumno1", 15);
		Alumno alumno2 = new Alumno("alumno2", 16);
		Alumno alumno3 = new Alumno("alumno3", 17);
		
		List<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(alumno);
		alumnos.add(alumno2);
		alumnos.add(alumno3);
		
		appWild.listar(alumnos);
		
		Persona persona = new Persona("persona1", 30);
		Persona persona2 = new Persona("persona2", 31);
		Persona persona3 = new Persona("persona3", 32);
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(persona);
		personas.add(persona2);
		personas.add(persona3);
		
		appWild.listarLowerBounded(personas);
		
		Set<Persona> personas2 = new HashSet<Persona>();
		personas2.add(new Persona("Israel", 32));
		personas2.add(new Persona("MAnuel", 40));
		personas2.add(new Persona("Israel", 33));
		
		for (Persona persona4 : personas2) {
			System.out.println(persona4.getName());
		}
		
	}
	
}
