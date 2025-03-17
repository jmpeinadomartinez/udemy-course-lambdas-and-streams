package com.debuggeando_ideas.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectorsToCollection {

	public static void main(String[] args) {		
		
		// Stream to List
		Stream<Videogame> videogames = Database.videogames.stream();
		List<Videogame> videoGameList = videogames.collect(Collectors.toList());
		videoGameList.forEach(System.out::println);
		
		// Stream to Set
		Stream<Videogame> videogames1 = Database.videogames.stream();
		Set<Videogame> videoGameSet = videogames1.collect(Collectors.toSet());
		videoGameSet.forEach(System.out::println);
		
		// Stream to Map
		Stream<Videogame> videogames2 = Database.videogames.stream();
		Map<String, Double> videoGameMap = videogames2.distinct().collect(Collectors.toMap(Videogame::getName, Videogame::getPrice));
		videoGameMap.forEach((k, v) -> System.out.println(k +" - "+ v));
		
	}
	
}
