package com.debuggeando_ideas.util_function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

	public static void main(String[] args) {
		BiFunction<String, String, String> normalizerFunc = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();
		
		String s1 = "Hola";
		String s2 = "Mundo";
		System.out.println(normalizerFunc.apply(s1, s2));
		
		BinaryOperator<String> normalizer = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();
		
		String s3 = "Hola";
		String s4 = "Mundo";
		System.out.println(normalizer.apply(s3, s4));		
		
	}

}
