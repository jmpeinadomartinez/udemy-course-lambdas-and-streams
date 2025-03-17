package com.debuggeando_ideas.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.BasicVideogame;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class StreamsIntermediateOperators {

	public static void main(String[] args) {

		// distinc()
		Stream<Videogame> videogames1 = Database.videogames.stream();
		System.out.println(videogames1.count());
		Stream<Videogame> videogames2 = Database.videogames.stream();
		System.out.println(videogames2.distinct().count());
		
		// limit()
		Stream<Videogame> videogames3 = Database.videogames.stream();
		System.out.println(videogames3.limit(5).count());
		
		// skip()
		Stream<Videogame> videogames4 = Database.videogames.stream();
		System.out.println(videogames4.skip(5).count());	
		
		// filter()
		Stream<Videogame> videogames5 = Database.videogames.stream();
		List<Videogame> videogameList = videogames5
			.filter(n -> n.getPrice() > 12.0)
			.filter(n -> !n.getIsDiscount())
			.filter(n -> n.getOfficialWebsite().contains("forza"))
			.collect(Collectors.toList());
		videogameList.forEach(System.out::println);
		
		// map()
		Stream<Videogame> videogames6 = Database.videogames.stream();
		List<BasicVideogame> games = videogames6.map(v -> {
			return BasicVideogame.builder()
				.name(v.getName())
				.price(v.getPrice())
				.console(v.getConsole())
				.build();
		}).collect(Collectors.toList());
		games.forEach(System.out::println);
		
		Stream<Videogame> videogames7 = Database.videogames.stream();
		List<String> titles = videogames7.map(v -> {
			return v.getName();
				
		}).collect(Collectors.toList());
		titles.forEach(System.out::println);
		
		// flatMap()
		Stream<Videogame> videogames8 = Database.videogames.stream();
		var r = videogames8.flatMap(v -> v.getReviews().stream())
				.collect(Collectors.toList());
		r.forEach(System.out::println);
		
		// map() vs flatMap()
		Stream<Videogame> videogames9 = Database.videogames.stream();
		Long reviewList = videogames9.flatMap(v -> v.getReviews().stream())
				.count();
		System.out.println(reviewList);	
		
		// peek()
//		Stream<Videogame> videogames10 = Database.videogames.stream();
//		videogames10.peek(v -> v.setName("")).forEach(System.out::println);
		
		// sorted()
		Stream<Videogame> videogames11 = Database.videogames.stream();
		List<Videogame> listSorted = videogames11.sorted(Comparator.comparingInt(v -> v.getReviews().size()))
				.collect(Collectors.toList());
		listSorted.forEach(v -> System.out.println(v.getReviews().size()));

		// takeWhile()
//		Stream<Videogame> videogames12 = Database.videogames.stream();
//		List<Videogame> videogameList2 = videogames12.sorted(Comparator.comparing( v -> v.getName() ))
//				.takeWhile(v -> !v.getName().startsWith("M"))
//				.collect(Collectors.toList());
//		videogameList2.forEach(System.out::println);
		
		// dropWhile()
		Stream<Videogame> videogames13 = Database.videogames.stream();
		List<Videogame> videogameList3 = videogames13.sorted(Comparator.comparing( v -> v.getName() ))
				.dropWhile(v -> !v.getName().startsWith("M"))
				.collect(Collectors.toList());
		videogameList3.forEach(System.out::println);
		
	}
}
