package com.futurecollars.lesson14.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task1/data.txt";
    Map<String, Contact> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
        loadContacts();
    }

    void loadContacts() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            while ((line = reader.readLine()) != null) {
                String name = line.substring(0, line.indexOf(';'));
                line = line.substring(line.indexOf(';') + 1);
                String phoneNumber = line.substring(0, line.indexOf(';'));
                String address = line.substring(line.indexOf(';') + 1);
                Contact contact = new Contact(name, phoneNumber, address);

                phoneBook.put(name, contact);
            }
        } catch (IOException ioex) {
            System.err.println("Could not load contacts, phone book is empty!");
        }
    }

    public Contact find(String name) throws RuntimeException {
        Contact contact;
        if (phoneBook.get(name) != null) {
            contact = phoneBook.get(name);
        } else {
            throw new RuntimeException("There is no such person in the phone book");
        }
        return contact;
    }

}
