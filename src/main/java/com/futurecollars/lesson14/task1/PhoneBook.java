package com.futurecollars.lesson14.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task1/data.txt";
    private final Map<String, Contact> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
        loadContacts();
    }

    private void loadContacts() {
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
        } catch (IOException ioException) {
            System.err.println("Could not load contacts, phone book is empty!");
        }
    }

    public Contact find(String name) {
        return Optional
                .ofNullable(phoneBook.get(name))
                .orElseThrow(() -> new RuntimeException("There is no such person in the phone book: " + name));
    }

}
