package com.futurecollars.lesson11.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListManager {

    ArrayList<String> createList() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");
        return names;
    }

    void displayUniqueElementsFromList(ArrayList<String> names) {
        HashSet<String> namesSet = new HashSet<>(names);
        System.out.println("The list with unique elements: \n" + namesSet);
    }

    static ArrayList<String> createListInReverseOrder(ArrayList<String> names) {
        ArrayList<String> listInReverseOrder = new ArrayList<>();
        for (int index = names.size() - 1; index >= 0; index--) {
            listInReverseOrder.add(names.get(index));
        }
        System.out.println("The list in reverse order: \n" + listInReverseOrder);
        return listInReverseOrder;
    }

    void replaceTheElementWithTheGivenOne(String oldName, String newName, ArrayList<String> listInReverseOrder) {
        LinkedList<String> linkedList = new LinkedList<>(listInReverseOrder);
        linkedList.replaceAll(s -> s.replace(oldName, newName));
        System.out.println("The changed list ( replaced " + oldName + " to " + newName + " ) in reverse order: \n" + linkedList);
    }

}
