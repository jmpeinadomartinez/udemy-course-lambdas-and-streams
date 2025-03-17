package com.debuggeando_ideas.optional;

import java.util.Optional;

public class Movie {

	private String name;
	private Double price;
	

	public Movie(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public Optional<String> getName(){
		return Optional.of(this.name);
	}
	
	public Optional<Double> getPrice(){
		return Optional.of(this.price);
	}
}
