package com.learning.learning.lambda;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		Operacion operacion = () -> 2;
		System.out.println(operacion.operacion());
		
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);

		integers.forEach(n->System.out.println(n));
		
		Runnable runnable = ()->System.out.println("Run");
		runnable.run();
		
	}

}
