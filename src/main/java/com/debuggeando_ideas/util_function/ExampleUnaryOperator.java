package com.debuggeando_ideas.util_function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ExampleUnaryOperator {

	static Function<Integer, Integer> multiple = n -> n * 10;
	static Function<Integer, Integer> sum = n -> n + 10;
	static UnaryOperator<Integer> unaryMultiple = n -> n * 10;
	static UnaryOperator<Integer> unarySum = n -> n + 10;

	public static void main(String[] args) {
		System.out.println(multiple.apply(5));
		System.out.println(sum.apply(5));
		System.out.println(unaryMultiple.apply(5));
		System.out.println(unarySum.apply(5));
	}

}
