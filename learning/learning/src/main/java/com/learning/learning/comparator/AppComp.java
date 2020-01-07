package com.learning.learning.comparator;

import java.util.ArrayList;
import java.util.Collections;import java.util.Comparator;
import java.util.List;

import com.learning.learning.exercises.Persona;

public class AppComp {

	public static void main(String[] args) {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Israel", 32));
		personas.add(new Persona("Manuel", 40));
		personas.add(new Persona("Daniel", 36));
		
		for (Persona persona : personas) {
			System.out.println(persona.getName());
		}
		
		Collections.sort(personas, new NombreComparator());
		
		System.out.println("--------");
		
		for (Persona persona : personas) {
			System.out.println(persona.getName());
		}
		
		System.out.println("========");
		
		Collections.sort(personas, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				int rpta = 0;
				if (o1.getEdad() > o2.getEdad()) {
					rpta = 1;
				}else if (o1.getEdad() < o2.getEdad()) {
					rpta = -1;
				}else {
					rpta = 0;
				}
				
				return rpta;
			}
			
			
			
		});
		
		for (Persona persona : personas) {
			System.out.println(persona.getName());
		}
	}
	
}
