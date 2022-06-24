package com.futurecollars.lesson12.task4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HeightComparator {

    Set<Person> personsSorted = new TreeSet(new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            int result = Integer.compare(o1.getHeight(), o2.getHeight());
            if (result == 0) {
                result = Integer.compare(System.identityHashCode(o1),
                        System.identityHashCode(o2));
            }
            return result;
        }

    });

    void displayPersons() {
        for (Person person : personsSorted) {
            System.out.println(person);
        }
    }

}
