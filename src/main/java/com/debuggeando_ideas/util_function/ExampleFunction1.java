package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction1 {

	static Function<Integer, Integer> multiple = n -> n * 10;
	static Function<Integer, Integer> sum = n -> n + 10;
	static Function<Integer, Integer> addThenMulitply = multiple.andThen(sum);
	static Function<Integer, Integer> composeMulitply = multiple.compose(sum);

	public static void main(String[] args) {
		System.out.println(multiple.apply(5));
		System.out.println(sum.apply(5));
		System.out.println(addThenMulitply.apply(5));
		System.out.println(composeMulitply.apply(5));
	}

}
