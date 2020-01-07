package com.learning.example.java8;

import java.util.ArrayList;
import java.util.List;

public class Lambdas {

	public void pruebas() {
		
		InterfazFuncional funcional = (List<Integer> listaNumeros) -> {
			int sum = 0;
			double ave = 0;
			listaNumeros.forEach(x->sum+=x.intValue());
			
			return ave;
			
		};
		
	}
	
	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(5);
		listaNumeros.add(6);
		
	}
	
}
