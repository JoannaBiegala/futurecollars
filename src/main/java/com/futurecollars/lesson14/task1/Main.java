package com.futurecollars.lesson14.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Contact> phoneBook = new HashMap<>();
        PhoneBookRepository phoneBookCreator = new PhoneBookRepository(phoneBook);
        phoneBookCreator.loadContacts();
        try {
            phoneBookCreator.find("Adam Nowak");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
