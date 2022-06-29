package com.futurecollars.lesson14.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PhoneBookCreator {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task1/data.txt";
    List<Contact> phoneBook;

    public PhoneBookCreator(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    void loadContacts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                Contact contact = new Contact();

                Optional<String> nameOptional = Optional.of(line.substring(0, line.indexOf(';')));
                if (nameOptional.isPresent()) {
                    contact.setName(line.substring(0, line.indexOf(';')));
                } else {
                    continue;
                }
                line = line.substring(line.indexOf(';') + 1);
                contact.setPhoneNumber(line.substring(0, line.indexOf(';')));
                Optional<String> addressOptional = Optional.of(line.substring(line.indexOf(';') + 1));
                if (addressOptional.isPresent()) {
                    contact.setAddress(line.substring(line.indexOf(';') + 1));
                } else {
                    continue;
                }
                phoneBook.add(contact);
            }
        } catch (IOException ioex) {
            System.err.println("Could not load contacts, phone book is empty!");
        }
    }

}
