package com.debuggeando_ideas.real_appplications;

import java.util.Objects;

import com.debuggeando_ideas.util.Console;
import com.debuggeando_ideas.util.Database;
import com.debuggeando_ideas.util.InvalidVideogameException;
import com.debuggeando_ideas.util.Videogame;

public class ValidatorApp {
	
	public static void main(String[] args) {
		
		var videogame1 = Database.videogames.get(0);
		var videogame2 = Database.videogames.get(1);
		var videogame3 = Database.videogames.get(2);
		var videogame4 = Database.videogames.get(3);
		
		// Forma validar con if-else
//		isValidVideogame(videogame1);	// Valid videogame
//		isValidVideogame(videogame2);	// Invalid videogame
//		isValidVideogame(videogame3);	// Invalid videogame
//		isValidVideogame(videogame4);	// Invalid videogame
		
		// Forma de validar con interfaces funcionales
		Validator.applyRules(Rules.rules, videogame1);
//		Validator.applyRules(Rules.rules, videogame2);
//		Validator.applyRules(Rules.rules, videogame3);
//		Validator.applyRules(Rules.rules, videogame4);		
		System.out.println("Valid videogame");

	}

	private static void isValidVideogame(Videogame videogame) {
		
		if(Objects.isNull(videogame)) {
			throw new IllegalArgumentException("Cant be null");
		} else {
			if(videogame.getPrice() < 20) {
				throw new InvalidVideogameException("Price must be greater than 20");
			} else if(!videogame.getConsole().equals(Console.XBOX)) {
				throw new InvalidVideogameException("Console must be for XBOX");
			} else if (videogame.getReviews().isEmpty()) {
				throw new InvalidVideogameException("Reviews cannot be empty");
			} else if (videogame.getTotalSold() < 10) {
				throw new InvalidVideogameException("Total sold must be greater than 10");
			} else if (videogame.getIsDiscount()) {
				throw new InvalidVideogameException("Videogame dont have discount");
			}
		}
		System.out.println("Valid videogame");
	}
		
}
