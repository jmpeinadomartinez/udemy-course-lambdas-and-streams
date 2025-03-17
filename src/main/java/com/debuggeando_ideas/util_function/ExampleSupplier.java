package com.debuggeando_ideas.util_function;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {
	
	static Supplier<Integer> randomInt = () -> new Random().nextInt(100);
	
	public static void main(String[] args) {

		System.out.println(randomInt.get());
	}

}
