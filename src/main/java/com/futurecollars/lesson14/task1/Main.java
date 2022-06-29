package com.futurecollars.lesson14.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contact> phoneBook = new ArrayList<>();
        PhoneBookCreator phoneBookCreator = new PhoneBookCreator(phoneBook);
        phoneBookCreator.loadContacts();
        Searcher searcher = new Searcher(phoneBook);
        try {
            System.out.println(searcher.searchContactByName("Adam Nowak"));
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
