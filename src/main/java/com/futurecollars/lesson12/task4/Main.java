package com.futurecollars.lesson12.task4;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        Person person1 = new Person("Anna", "Nowak", 1999, 170, 60);
        Person person2 = new Person("Hanna", "Nowakowska", 1989, 170, 67);
        Person person3 = new Person("Joanna", "Malinowska", 2000, 175, 70);
        Person person4 = new Person("Anna", "Kowalska", 1997, 160, 80);
        Person person5 = new Person("Barbara", "Nowak", 1999, 170, 60);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        HeightComparator heightComparator = new HeightComparator();
        heightComparator.personsSorted.addAll(persons);
        System.out.println("The persons sorted by height");
        heightComparator.displayPersons();

        WeightComparator weightComparator = new WeightComparator();
        weightComparator.personsSorted.addAll(persons);
        System.out.println("The persons sorted by weight (reverse)");
        weightComparator.displayPersons();

        System.out.println("The persons sorted by age (default and reverse)");
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}
