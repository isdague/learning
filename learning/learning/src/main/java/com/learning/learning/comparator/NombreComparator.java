package com.learning.learning.comparator;

import java.util.Comparator;

import com.learning.learning.exercises.Persona;

public class NombreComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o1.getName().compareTo(o2.getName());
		
	}

	
	
}
