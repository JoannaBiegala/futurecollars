package com.futurecollars.lesson7;

public class Main {
    public static void main(String[] args) {
        TicketSeller ticketSeller = new TicketSeller("Adam","Malinowski",2021);
        System.out.println("Sprzedawca biletów: " + ticketSeller);
        System.out.println(" Kwota postawowego wynagrodzenia sprzedawcy biletów wynosi:"+ ticketSeller.getBasicSalary());
        System.out.println(" Sprzedawca biletów pracuje lat:"+ ticketSeller.getYearsOfWork());
        System.out.println(" Kwota obecnego wynagrodzenia sprzedawcy biletów wynosi:"+ ticketSeller.calculateMonthlySalary() + "\n");

        Manager manager = new Manager("Marek","Kwiatkowski",2020);
        System.out.println("Manager: " + manager);
        System.out.println(" Kwota postawowego wynagrodzenia managera wynosi:"+ manager.getBasicSalary());
        System.out.println(" Manager pracuje lat:"+ manager.getYearsOfWork());
        System.out.println(" Kwota obecnego wynagrodzenia managera wynosi:"+ manager.calculateMonthlySalary());

        manager.setBonus(200);
        System.out.println(" Kwota wynagrodzenia managera po zmianie bonusu na 200 wynosi:"+ manager.calculateMonthlySalary());

    }
}
