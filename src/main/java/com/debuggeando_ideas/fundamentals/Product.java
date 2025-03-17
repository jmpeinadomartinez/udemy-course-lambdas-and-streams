package com.debuggeando_ideas.fundamentals;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Product {

    private Long id;
    private String name;
    private Double price;
}
