package com.futurecollars.lesson14.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Optional;

public class PhoneBookRepository {

    private static final String DATA_PATH = "src/main/java/com/futurecollars/lesson14/task1/data.txt";
    Map<String, Contact> phoneBook;

    public PhoneBookRepository(Map<String, Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    void loadContacts() {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_PATH))) {
            while ((line = reader.readLine()) != null) {
                Contact contact = new Contact();
                String name = line.substring(0, line.indexOf(';'));
                contact.setName(name);
                line = line.substring(line.indexOf(';') + 1);
                contact.setPhoneNumber(line.substring(0, line.indexOf(';')));
                contact.setAddress(line.substring(line.indexOf(';') + 1));
                phoneBook.put(name, contact);
            }
        } catch (IOException ioex) {
            System.err.println("Could not load contacts, phone book is empty!");
        }
    }

    public void find(String name) throws NoSuchFieldException {
        Optional<Contact> optionalContact = Optional.ofNullable(phoneBook.get(name));
        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            System.out.println("Name: " + contact.getName() + ", Adres: " + contact.getAddress() + ", Telefon: " + contact.getPhoneNumber());
        } else {
            throw new NoSuchFieldException("There is no such person in the phone book");
        }
    }

}
