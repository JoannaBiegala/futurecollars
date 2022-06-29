package com.futurecollars.lesson14.task1;

import java.util.List;

public class Searcher {

    List<Contact> phoneBook;

    public Searcher(List<Contact> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String searchContactByName(String name) throws NoSuchFieldException {
        for (Contact contact : phoneBook) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return "Name: " + name + ", Adres: " + contact.getAddress() + ", Telefon: " + contact.getPhoneNumber();
            }
        }
        throw new NoSuchFieldException();
    }

}
