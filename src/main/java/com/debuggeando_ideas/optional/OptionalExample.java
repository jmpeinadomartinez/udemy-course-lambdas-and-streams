package com.debuggeando_ideas.optional;

import java.util.Optional;

import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.Videogame;

public class OptionalExample {

    public static void main(String[] args) {
    	
    	Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
    	System.out.println(gtaOpt.get());
    	
    	Optional<Videogame> gtaOptNull = Optional.ofNullable(null);
    	System.out.println(gtaOptNull.orElse(Database.videogames.get(6)));
    	
    	System.out.println(gtaOptNull.orElseThrow(() -> new RuntimeException("Videogame not foung")));
    	
    	
    }
}
