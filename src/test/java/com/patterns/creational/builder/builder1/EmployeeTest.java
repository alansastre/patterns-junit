package com.patterns.creational.builder.builder1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {



    @Test
    @DisplayName("Employee")
    void createEmployee() {

        Employee employee =  new Employee.EmployeeBuilder().build();

        employee.setLastname("perez");
        employee.setName("Juan");

        assertTrue(employee instanceof Employee);

        assertEquals("perez", employee.getLastname());
        assertEquals("Juan", employee.getName());
    }

}