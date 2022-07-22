package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketSellerTest {

    @Test
    void shouldBeMonthlySalaryWithDefaultBasicSalary() {
        //given
        String firstName = "Adam";
        String lastName = "Nowak";
        int yearOfEmployment = 2020;
        //when
        TicketSeller ticketSeller = new TicketSeller(firstName, lastName, yearOfEmployment);
        int expectedMonthlySalary = ticketSeller.calculateMonthlySalary();
        //then
        assertEquals(3000, expectedMonthlySalary);
    }

    @Test
    void shouldBeMonthlySalary() {
        //given
        String firstName = "Adam";
        String lastName = "Nowak";
        int basicSalary = 4000;
        int yearOfEmployment = 2020;
        //when
        TicketSeller ticketSeller = new TicketSeller(firstName, lastName, basicSalary, yearOfEmployment);
        int expectedMonthlySalary = ticketSeller.calculateMonthlySalary();
        //then
        assertEquals(4000, expectedMonthlySalary);
    }

}