package com.futurecollars.lesson7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketSellerTest {

    @Test
    void calculateMonthlySalaryWithDefaultBasicSalary() {
        //given
        String firstName = "Adam";
        String lastName = "Nowak";
        int yearOfEmployment = 2020;

        //when
        TicketSeller ticketSeller = new TicketSeller(firstName, lastName, yearOfEmployment);
        int shouldReturnMonthlySalary = ticketSeller.calculateMonthlySalary();

        //then
        assertEquals(3000, shouldReturnMonthlySalary);

    }

    @Test
    void calculateMonthlySalary() {
        //given
        String firstName = "Adam";
        String lastName = "Nowak";
        int basicSalary = 4000;
        int yearOfEmployment = 2020;

        //when
        TicketSeller ticketSeller = new TicketSeller(firstName, lastName, basicSalary, yearOfEmployment);
        int shouldReturnMonthlySalary = ticketSeller.calculateMonthlySalary();

        //then
        assertEquals(4000, shouldReturnMonthlySalary);

    }
}