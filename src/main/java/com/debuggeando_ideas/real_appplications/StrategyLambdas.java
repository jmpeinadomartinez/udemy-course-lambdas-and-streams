package com.debuggeando_ideas.real_appplications;

import java.util.Arrays;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

public class StrategyLambdas {
	
	public static void main(String[] args){
		
		Product product1 = Product.builder().id(1L).name("Bear").price(150D).userType("BASIC").build();
		Product product2 = Product.builder().id(2L).name("Bear").price(150D).userType("PLUS").build();
		Product product3 = Product.builder().id(3L).name("Bear").price(150D).userType("PRIME").build();
	
		List<Product> products = List.of(product1, product2, product3);
		products.forEach(p -> {
			switch(p.getUserType()) {
				case "BASIC":
					p.setDiscountStrategy(Strategies.basicDiscount);
					break;
				case "PLUS":
					p.setDiscountStrategy(Strategies.plusDiscount);
					break;
				case "PRIME":
					p.setDiscountStrategy(Strategies.primeDiscount);
					break;				
				}
		});
		
		products.forEach(p -> {
			System.out.println("Price: " +p.getPrice()+ " User type: " +p.getUserType()+ "Discount: " +p.getDiscountStrategy().get(p.getPrice()));
		});
	
	}

}

class Strategies {
	static ApplyDiscountStrategy basicDiscount = p -> p * 0.2;
	static ApplyDiscountStrategy plusDiscount = p -> p * 0.5;
	static ApplyDiscountStrategy primeDiscount = p -> p * 0.08;
}

@FunctionalInterface
interface ApplyDiscountStrategy{
	Double get(Double price);
}

@Data
@ToString
@Builder
class Product {
	private Long id;
	private String userType;
	private String name;
	private Double price;
	private ApplyDiscountStrategy discountStrategy;
}