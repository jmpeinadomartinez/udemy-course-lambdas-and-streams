package com.debuggeando_ideas.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectionsPartitions {

	public static void main(String[] args) {		
		
		// Collectors.partitioningBy
		Stream<Videogame> videogames = Database.videogames.stream();
		Map<Boolean, List<Videogame>> result = videogames.collect(Collectors.partitioningBy(v -> v.getPrice()>15.0));
		result.forEach((k, v) -> System.out.println(k +" - "+ v));
	}
}
