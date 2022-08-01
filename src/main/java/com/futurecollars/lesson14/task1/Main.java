package com.futurecollars.lesson14.task1;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = phoneBook.find("Adam Nowak");
        System.out.println(contact.toString());
    }

}
