package com.debuggeando_ideas.optional;

import java.util.Optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class OptionalMap {

    public static void main(String[] args) {
    	
    	Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
    	String website = gtaOpt.map(v -> "The official website is " + v.getOfficialWebsite())
								.orElseThrow(RuntimeException::new);
    	
    	System.out.println(website);
    }
}
