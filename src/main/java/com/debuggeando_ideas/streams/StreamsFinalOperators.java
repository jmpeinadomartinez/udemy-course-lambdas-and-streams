package com.debuggeando_ideas.streams;

import java.util.Optional;
import java.util.stream.Stream;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class StreamsFinalOperators {

	public static void main(String[] args) {

		// count()
		Stream<Videogame> videogames1 = Database.videogames.stream();
		System.out.println(videogames1.count());
		
		// foreach()
		Stream<Videogame> videogames2 = Database.videogames.stream();
		videogames2.forEach(System.out::println);
		
		// anyMatch()
		Stream<Videogame> videogames3 = Database.videogames.stream();
		Boolean r1 = videogames3.anyMatch(s -> s.getTotalSold() > 1);
		System.out.println(r1);
		
		// allMatch()
		Stream<Videogame> videogames4 = Database.videogames.stream();
		Boolean r2 = videogames4.allMatch(s -> s.getTotalSold() > 1);
		System.out.println(r2);		
		
		// notMatch()
		Stream<Videogame> videogames5 = Database.videogames.stream();
		Boolean r3 = videogames5.noneMatch(s -> s.getReviews().isEmpty());
		System.out.println(r3);		
		
		// findFirst()
		Stream<Videogame> videogames6 = Database.videogames.stream();
		Optional<Videogame> r4 = videogames6.findFirst();
		System.out.println(r4.get());	
		
		// findAny()
		Stream<Videogame> videogames7 = Database.videogames.stream();
		Optional<Videogame> r5 = videogames7.findAny();
		System.out.println(r5.get());
		
		// reduce()		
		Stream<Videogame> videogames8 = Database.videogames.stream();
		Optional<Integer> r6 = videogames8.filter(Videogame::getIsDiscount)
				.map(Videogame::getTotalSold)
				.reduce(Integer::sum);
		System.out.println(r6.get());

		// max()		
		Stream<Videogame> videogames9 = Database.videogames.stream();
		Optional<Videogame> r7 = videogames9.max((a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(r7.get().getName());
		
		// min()		
		Stream<Videogame> videogames10 = Database.videogames.stream();
		Optional<Videogame> r8 = videogames10.min((a, b) -> a.getName().compareTo(b.getName()));
		System.out.println(r8.get().getName());
		
	}
}
