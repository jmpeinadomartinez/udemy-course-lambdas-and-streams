package com.debuggeando_ideas.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements  DatabaseService<Employee>
{
    @Override
    public Employee getById(Long id) {
        return Employee.builder()
    		.dni(UUID.randomUUID().toString())
    		.name("Pedro")
    		.salary(10000.0)
    		.build();
    }

    @Override
    public List<Employee> getAllRecords() {
        return null;
    }
}
