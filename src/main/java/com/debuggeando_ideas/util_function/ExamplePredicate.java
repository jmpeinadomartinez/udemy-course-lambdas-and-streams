package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

	static Predicate<Integer> isGreaterThan100 = n -> n > 100;
	static Predicate<Integer> isLessThan10 = n -> n < 10;
	static Predicate<Integer> isBetween10And100 = isGreaterThan100.or(isLessThan10);

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
		numbers.removeIf(isGreaterThan100);
		System.out.println(numbers);
		
		List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
		numbers2.removeIf(isLessThan10);
		System.out.println(numbers2);
		
		List<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
		numbers3.removeIf(isBetween10And100);
		System.out.println(numbers3);
	}

}
