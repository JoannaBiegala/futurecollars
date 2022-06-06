package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {

    @Test
    void calculateMonthlySalaryWithDefaultBasicSalaryAndDefaultBonus() {
        //given
        String firstName = "Jarek";
        String lastName = "Kwiatkowski";
        int yearOfEmployment = 2021;

        //when
        Manager manager = new Manager(firstName, lastName, yearOfEmployment);
        int shouldReturnMonthlySalary = manager.calculateMonthlySalary();

        //then
        assertEquals(5500, shouldReturnMonthlySalary);

    }

    @Test
    void calculateMonthlySalaryWithDefaultBonus() {
        //given
        String firstName = "Marek";
        String lastName = "Kwiatkowski";
        int basicSalary = 7000;
        int yearOfEmployment = 2020;

        //when
        Manager manager = new Manager(firstName, lastName, basicSalary, yearOfEmployment);
        int shouldReturnMonthlySalary = manager.calculateMonthlySalary();

        //then
        assertEquals(7500, shouldReturnMonthlySalary);

    }

    @Test
    void calculateMonthlySalary() {
        //given
        String firstName = "Marek";
        String lastName = "Kwiatkowski";
        int basicSalary = 9000;
        int yearOfEmployment = 2020;
        int bonus = 100;

        //when
        Manager manager = new Manager(firstName, lastName, basicSalary, yearOfEmployment, bonus);
        int shouldReturnMonthlySalary = manager.calculateMonthlySalary();

        //then
        assertEquals(9100, shouldReturnMonthlySalary);

    }
}