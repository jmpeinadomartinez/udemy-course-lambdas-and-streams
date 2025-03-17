package com.debuggeando_ideas.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class CollectorsReduceFunctions {

	public static void main(String[] args) {		
		
		// Collectors.averagingDouble
		Stream<Videogame> videogames = Database.videogames.stream();
		Double avg = videogames.collect(Collectors.averagingDouble(Videogame::getPrice));
		System.out.println(avg);
		
		// Collectors.summarizingInt
		Stream<Videogame> videogames1 = Database.videogames.stream();
		IntSummaryStatistics summaryStatistics = videogames1.collect(Collectors.summarizingInt(v -> v.getReviews().size()));
		System.out.println(summaryStatistics.getSum());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getCount());

		// Collectors.joining
		Stream<Videogame> videogames2 = Database.videogames.stream();
		String st = videogames2.map(Videogame::toString).collect(Collectors.joining());
		System.out.println(st);
		
		// Collectors.joining
		Stream<Videogame> videogames3 = Database.videogames.stream();
		String st1 = videogames3.map(Videogame::toString).collect(Collectors.joining("\n"));
		System.out.println(st1);
	}
		
}
