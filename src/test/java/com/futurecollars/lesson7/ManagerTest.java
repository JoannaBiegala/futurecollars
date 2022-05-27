package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {

    @Test
    void calculateMonthlySalary() {
        //given
        String firsNameManager = "Marek";
        String lastNameManager = "Kwiatkowski";
        int basicSalaryManager = 7000;
        int yearOfEmploymentManager  = 2020;

        //when
        Manager manager = new Manager(firsNameManager,lastNameManager,basicSalaryManager,yearOfEmploymentManager);
        int monthSalary = manager.calculateMonthlySalary();

        //then
        assertEquals(19000,monthSalary);

    }
}