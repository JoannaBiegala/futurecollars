package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManagerTest {

    @Test
    void shouldBeMonthlySalaryWithDefaultBasicSalaryAndDefaultBonus() {
        //given
        String firstName = "Jarek";
        String lastName = "Kwiatkowski";
        int yearOfEmployment = 2021;
        //when
        Manager manager = new Manager(firstName, lastName, yearOfEmployment);
        int expectedMonthlySalary = manager.calculateMonthlySalary();
        //then
        assertEquals(5500, expectedMonthlySalary);
    }

    @Test
    void shouldBeMonthlySalaryWithDefaultBonus() {
        //given
        String firstName = "Marek";
        String lastName = "Kwiatkowski";
        int basicSalary = 7000;
        int yearOfEmployment = 2020;
        //when
        Manager manager = new Manager(firstName, lastName, basicSalary, yearOfEmployment);
        int expectedMonthlySalary = manager.calculateMonthlySalary();
        //then
        assertEquals(7500, expectedMonthlySalary);
    }

    @Test
    void shouldBeMonthlySalary() {
        //given
        String firstName = "Marek";
        String lastName = "Kwiatkowski";
        int basicSalary = 9000;
        int yearOfEmployment = 2020;
        int bonus = 100;
        //when
        Manager manager = new Manager(firstName, lastName, basicSalary, yearOfEmployment, bonus);
        int expectedMonthlySalary = manager.calculateMonthlySalary();
        //then
        assertEquals(9100, expectedMonthlySalary);
    }

}