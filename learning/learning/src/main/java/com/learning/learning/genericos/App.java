package com.learning.learning.genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
	
		Clase<String> clase = new Clase<String>("Israel");
		clase.mostrarTipo();
		
		Clase<Integer> clase2 = new Clase<Integer>(10);
		clase2.mostrarTipo();
		
		String[] arregloSencillo = new String[5];
		for (int i = 0; i < arregloSencillo.length; i++) {
			System.out.println(arregloSencillo[i]);
		}
	
		List<String> list = new ArrayList<String>();
		list.add("Hola");
		list.add("Mundo");
		list.add("2");
		list.add("AAAA");
		list.add("Mundo");
		
		Set<String> set = new HashSet<String>();
		set.add("Hola");
		set.add("Mundo");
		set.add("2");
		set.add("AAAA");
		set.add("Mundo");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		Collections.sort(list);
		System.out.println("----------");
		for (String string : list) {
			System.out.println(string);
		}
		
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("<<<<<<<<<");
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println("<<<<<<<<<");
		for (String string : set) {
			System.out.println(string);
		}
		
	}
	
	
	
}
