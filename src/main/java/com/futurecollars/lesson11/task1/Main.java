package com.futurecollars.lesson11.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ListManager listManager = new ListManager();
        ArrayList<String> names = listManager.createList();
        listManager.displayUniqueElementsFromList(names);
        ArrayList<String> listInReverseOrder = ListManager.createListInReverseOrder(names);
        listManager.replaceTheElementWithTheGivenOne("Anna", "Joanna", listInReverseOrder);
    }

}
