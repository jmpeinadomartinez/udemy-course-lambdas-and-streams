package com.debuggeando_ideas.fundamentals;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Employee {

    private String dni;
    private String name;
    private Double salary;
}
