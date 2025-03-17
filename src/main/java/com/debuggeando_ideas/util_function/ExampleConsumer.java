package com.debuggeando_ideas.util_function;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExampleConsumer {
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>(List.of(1,2,3,4,5));
		List<Integer> squares = new ArrayList<>();
		numList.forEach(n -> squares.add(n*n));
		System.out.println(numList);
		System.out.println(squares);
		
		Map<Boolean, String> map = Map.of(true, "this is the truth", false, "this is the lie");
		map.forEach((k, v) -> System.out.println(k +" - "+ v));
	}

}
