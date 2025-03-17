package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class ProductDB implements  DatabaseService<Product> {

    @Override
    public Product getById(Long id) {
    	return Product.builder()
	        .id(id)
			.name("Galletas")
			.price(20.0)
			.build();
    }

    @Override
    public List<Product> getAllRecords() {
        return null;
    }
}
